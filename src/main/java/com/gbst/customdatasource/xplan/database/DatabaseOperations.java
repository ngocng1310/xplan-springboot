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

        for (Map row : rows) {
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

        String query = "\n" +
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

        for (Map row : rows) {
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
        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.parseInt(partyId));

        ContactDetails contactDetails = getContactDetailsByPartyId(partyId, ClientType.PERSON);

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

    private ContactDetails getContactDetailsByPartyId(String partyId, ClientType clientType) {
        String query = "select p.id, " +
                "p.party_type,\n" +
                "'Addresses' as \"ContactTypes\",\n" +
                "'Unknown' as \"PreferredContactMethod\"\n" +
                "\n" +
                "from party p\n" +
                "\n" +
                "where p.id = :partyId";

        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.parseInt(partyId));

        RowMapper<ContactDetails> mapper = new RowMapper<ContactDetails>() {
            @Override
            public ContactDetails mapRow(ResultSet rs, int i) throws SQLException {
                ContactDetails cd = new ContactDetails();
                cd.setPreferredContactMethod(ContactMethod.UNKNOWN);
                List<Object> details = cd.getAddressesOrPhoneNumbersOrEmailAddresses();
                ContactDetails.Addresses addresses = new ContactDetails.Addresses();
                List<ContactDetails.Addresses.Address> allAddresses = getAddresses(partyId, clientType);
                addresses.getAddress().addAll(allAddresses);
                details.add(addresses);
                return cd;
            }
        };

        ContactDetails contactDetails = sharesTemplate.queryForObject(query, params, mapper);
        return contactDetails;
    }

    private List<ContactDetails.Addresses.Address> getAddresses(String partyId, ClientType clientType) {
        List<ContactDetails.Addresses.Address> result = new ArrayList<ContactDetails.Addresses.Address>();
        String addressQuery = "select (case when paddr.address_type = 'POSTAL' then 'Postal' else 'Street' end) as \"Type\", " +
                "addr.line1 as \"Line1\", " +
                "addr.line2 as \"Line2\", " +
                "addr.line3 as \"Line3\", " +
                "addr.suburb as \"Suburb\", " +
                "addr.state as \"State\", " +
                "addr.postcode as \"Postcode\", " +
                "sc.\"ISO2-country\" as \"Country\", " +
                "(case when paddr.address_type = 'POSTAL' then 'T' else 'F' end) as \"Preferred\"\n" +
                "from address addr\n" +
                "join party_address paddr on paddr.address_id = addr.id\n" +
                "join country country on country.id = addr.country_id\n" +
                "join shares.countries sc on sc.\"ISO3-country\" = country.alpha3_code\n" +
                "join party p on p.id = paddr.party_id\n" +
                "where paddr.party_id = :partyId";

        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.parseInt(partyId));
        List<Map<String, Object>> rows = sharesTemplate.queryForList(addressQuery, params);
        for (Map row : rows) {
            ContactDetails.Addresses.Address temp = new ContactDetails.Addresses.Address();
            temp.setType(AddressType.fromValue(String.valueOf(row.get("Type"))));
            temp.setLine1(String.valueOf(row.get("Line1")));
            temp.setLine1(String.valueOf(row.get("Line2")));
            temp.setLine1(String.valueOf(row.get("Line3")));
            temp.setLine1(String.valueOf(row.get("Suburb")));
            temp.setLine1(String.valueOf(row.get("State")));
            temp.setLine1(String.valueOf(row.get("Postcode")));
            temp.setLine1(String.valueOf(row.get("Country")));
            if (clientType == ClientType.PERSON) {
                // Postal address is preferred
                if (temp.getType() == AddressType.POSTAL) {
                    temp.setPreferred(true);
                }
            }
            result.add(temp);
        }
        return result;
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
