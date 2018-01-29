package com.gbst.customdatasource.xplan.database;

import com.gbst.customdatasource.xplan.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DatabaseOperations {
    private NamedParameterJdbcTemplate sharesTemplate;

    public List<EPIDataResponse.Advisers.Adviser> getAdvisers() {
//        String query = queryRepository.getQuery("getAdviserInfoQuery");
        String query = "SELECT a.orgcode||'-'||a.advcode as Id, a.advname as FirstName, a.advname as LastName FROM shares.advisor a";
        Map<String, String> params = new HashMap<>();
//        params.put("orgCode", orgCode);
//        params.put("advCode", advCode);

        List<EPIDataResponse.Advisers.Adviser> advisers = new ArrayList<>();
        List<Map<String, Object>> rows = sharesTemplate.queryForList(query, params);

        for(Map row: rows) {
            EPIDataResponse.Advisers.Adviser adviser = new EPIDataResponse.Advisers.Adviser();
            adviser.setId(String.valueOf(row.get("Id")));
            adviser.setFirstName(String.valueOf(row.get("FirstName")));
            adviser.setLastName(String.valueOf(row.get("LastName")));
            advisers.add(adviser);
        }
        return advisers;
    }



    public List<EPIDataResponse.Clients.Client> getClientsByAdviserId(String adviserId) {
        String orgCode = getOrgCodeFromAdviserId(adviserId);
        String advCode = getAdvCodeFromAdviserId(adviserId);

        String query ="\n" +
                "select distinct p.id, p.party_type\n" +
                "\n" +
                "from party p\n" +
                "join party_role pr on pr.party_id = p.id\n" +
                "join party_role_account_relationship prar on pr.id = prar.party_role_id\n" +
                "join account a on a.back_office = 'SHARES' and a.id = prar.account_id -- We will be assuming a one to one relationship exists between Shares accounts and DCA accounts\n" +
                "join shares.client c on c.clcode = a.account_number\n" +
                "join shares.advisor ad on ad.advisorid = c.advisorid\n" +
                "\n" +
                "where\n" +
                "ad.advcode = :advCode -- passed through from advisers.sql - advisercode\n" +
                "and ad.orgcode = :orgCode -- passed through from advisers.sql - adviserorganisation\n" +
                "and (party_type in ('COMPANY','TRUST','SUPERANNUATION_FUND') OR (party_type = 'PERSON' and prar.party_role_account_rel_type = 'OWNER' and (prar.party_role_account_onboarding_rel_type is null))) -- logic TBC";
        Map<String, String> params = new HashMap<>();
        params.put("orgCode", orgCode);
        params.put("advCode", advCode);

        List<EPIDataResponse.Clients.Client> clients = new ArrayList<>();
        List<Map<String, Object>> rows = sharesTemplate.queryForList(query, params);

        for(Map row: rows) {
            EPIDataResponse.Clients.Client client = new EPIDataResponse.Clients.Client();
            client.setId(String.valueOf(row.get("id")));
            final String CLIENT_TYPE = String.valueOf(row.get("party_type"));
            switch (CLIENT_TYPE) {
                case "PERSON":
                    EntityPerson person = getPersonByPartyId(client.getId());
                    client.setPerson(person);
                    break;
                case "COMPANY":
                    EntityOrganisation organisation = new EntityOrganisation();
                    client.setOrganisation(organisation);
                    break;
                case "TRUST":
                    EntityTrust trust = new EntityTrust();
                    client.setTrust(trust);
                    break;
                case "SUPERANNUATION_FUND":
                    EntitySuperfund superfund = new EntitySuperfund();
                    client.setSuperfund(superfund);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported client type: " + CLIENT_TYPE);
            }
            clients.add(client);
        }

        return clients;
    }

    private EntityPerson getPersonByPartyId(String partyId) {
        String query = "select pe.last_name as \"LastName\", pe.given_names as \"FirstName\"\n" +
                "\n" +
                "from party p\n" +
                "join person pe on pe.id = p.id\n" +
                "\n" +
                "where p.id = :partyId";
        Map<String, String> params = new HashMap<>();
        params.put("partyId", partyId);

        ContactDetails contactDetails = getContactDetailsByPartyId(partyId);
        RowMapper<EntityPerson> mapper = new RowMapper<EntityPerson>() {
            @Override
            public EntityPerson mapRow(ResultSet rs, int i) throws SQLException {
                EntityPerson entityPerson = new EntityPerson();
                entityPerson.setFirstName(rs.getString("FirstName"));
                entityPerson.setLastName(rs.getString("LastName"));
                entityPerson.setContactDetails(contactDetails);
                return entityPerson;
            }
        };


        EntityPerson person = sharesTemplate.queryForObject(query, params, mapper);

        return person;
    }

    private ContactDetails getContactDetailsByPartyId(String partyId) {
        String query = "select p.id, p.party_type,\n" +
                "'Addresses' as \"ContactTypes\",\n" +
                "'Unknown' as \"PreferredContactMethod\"\n" +
                "\n" +
                "from party p\n" +
                "\n" +
                "where p.id = :partyId";

        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.parseInt(partyId));

        ContactDetails contactDetails = sharesTemplate.queryForObject(query, params, new RowMapper<ContactDetails>() {
            @Override
            public ContactDetails mapRow(ResultSet rs, int i) throws SQLException {
                ContactDetails cd = new ContactDetails();
                cd.setPreferredContactMethod(ContactMethod.UNKNOWN);
                List<Object> details = cd.getAddressesOrPhoneNumbersOrEmailAddresses();
                ContactDetails.Addresses addresses = new ContactDetails.Addresses();
                ContactDetails.Addresses.Address a = getAddress(partyId);
                addresses.getAddress().add(a);
                details.add(addresses);
                return cd;
            }
        });
        return contactDetails;
    }

    private ContactDetails.Addresses.Address getAddress(String partyId) {
        String addressQuery = "select (case when paddr.address_type = 'POSTAL' then 'Postal' else 'Street' end) as \"Type\", " +
                "addr.line1 as \"Line1\", " +
                "addr.line2 as \"Line2\", " +
                "addr.line3 as \"Line3\", " +
                "addr.suburb as \"Suburb\", " +
                "addr.state as \"State\", " +
                "addr.postcode as \"Postcode\", \n" +
                "sc.\"ISO2-country\" as \"Country\",\n" +
                "(case when paddr.address_type = 'POSTAL' then 'T' else 'F' end) as \"Preferred\"\n" +
                "\n" +
                "from address addr\n" +
                "join party_address paddr on paddr.address_id = addr.id\n" +
                "join country country on country.id = addr.country_id\n" +
                "join shares.countries sc on sc.\"ISO3-country\" = country.alpha3_code\n" +
                "join party p on p.id = paddr.party_id\n" +
                "\n" +
                "where paddr.party_id = :partyId";

        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.parseInt(partyId));

        ContactDetails.Addresses.Address a = sharesTemplate.queryForObject(addressQuery, params, new RowMapper<ContactDetails.Addresses.Address>() {
            @Override
            public ContactDetails.Addresses.Address mapRow(ResultSet rs, int i) throws SQLException {
                ContactDetails.Addresses.Address temp = new  ContactDetails.Addresses.Address();
                temp.setType(AddressType.fromValue(rs.getString("Type")));
                temp.setLine1(rs.getString("Line1"));
                temp.setLine2(rs.getString("Line2"));
                temp.setLine3(rs.getString("Line3"));
                temp.setSuburb(rs.getString("Suburb"));
                temp.setState(rs.getString("State"));
                temp.setPostCode(rs.getString("Postcode"));
                temp.setCountry(Country.fromValue(rs.getString("Country")));
                return temp;
            }
        });
        return a;
    }

    private String getOrgCodeFromAdviserId(String adviserId) {
        String[] arr = adviserId.split("-");
        return arr[0];
    }

    private String getAdvCodeFromAdviserId(String adviserId) {
        String[] arr = adviserId.split("-");
        return arr[1];
    }
    @Autowired
    public void setSharesDataSource(DataSource sharesDataSource) {
        this.sharesTemplate = new NamedParameterJdbcTemplate(sharesDataSource);
    }
}
