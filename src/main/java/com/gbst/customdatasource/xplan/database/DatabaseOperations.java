package com.gbst.customdatasource.xplan.database;

import com.gbst.customdatasource.xplan.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DatabaseOperations {
    private NamedParameterJdbcTemplate sharesTemplate;

    private static final String ORG_CODE = "1188";
    private static final String ADVISER_CODE = "88";
    private static final String XPLAN_ADVISER = ORG_CODE + "-" + ADVISER_CODE;

    public List<EPIDataResponse.Advisers.Adviser> getAdvisers() {
//        String query = queryRepository.getQuery("getAdviserInfoQuery");

        // advisers.sql
        String query = "SELECT a.orgcode||'-'||a.advcode AS Id, " +
                "a.advname AS FirstName, " +
                "a.advname AS LastName \n" +
                "FROM shares.advisor a \n" +
                "where a.advcode = :advCode\n" +
                "and a.orgcode = :orgCode\n";
        Map<String, String> params = new HashMap<>();
        params.put("orgCode", ORG_CODE);
        params.put("advCode", ADVISER_CODE);

        List<EPIDataResponse.Advisers.Adviser> advisers = new ArrayList<>();

        // should only expect one record so can changet to queryForObject later
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

    public List<EPIDataResponse.Accounts.InvestmentHoldings.InvestmentHolding> getInvestmentHoldings() {
        List<EPIDataResponse.Accounts.InvestmentHoldings.InvestmentHolding> investmentHoldingsList = new ArrayList<>();
        // investmentholdings.sql
        String query = "select c.clcode as \"AccountId\",\n" +
                "ch.seccode as \"InvestmentCode\",\n" +
                "ch.\"market-id\" as \"Exchange\",\n" +
                "'F' as \"IsCashAccount\",\n" +
                "'AUD' as \"AccountCurrency\",\n" +
                "'F' as \"Delete\",\n" +
                "'F' as \"Deleted\"\n" +
                "from shares.client c\n" +
                "join shares.advisor ad on ad.advisorid = c.advisorid\n" +
                "join shares.\"cli-hold\" ch on ch.clcode = c.clcode\n" +
                "where ad.advcode = :advCode\n" +
                "and ad.orgcode = :orgCode\n";
        Map<String, String> params = new HashMap<>();
        params.put("advCode", ADVISER_CODE);
        params.put("orgCode", ORG_CODE);
        List<Map<String, Object>> rows = sharesTemplate.queryForList(query, params);
        for (Map row : rows) {
            EPIDataResponse.Accounts.InvestmentHoldings.InvestmentHolding investmentHolding = new EPIDataResponse.Accounts.InvestmentHoldings.InvestmentHolding();
            investmentHolding.setAccountId(String.valueOf(row.get("AccountId")));
            investmentHolding.setInvestmentCode(String.valueOf(row.get("InvestmentCode")));
            investmentHolding.setExchange(String.valueOf(row.get("Exchange")));
            investmentHolding.setIsCashAccount(false);
            investmentHolding.setDeleted(false);
            investmentHoldingsList.add(investmentHolding);
        }
        return investmentHoldingsList;
    }

    public List<EPIDataResponse.SecurityMaster.InvestmentProduct> getInvestmentProducts() {
        List<EPIDataResponse.SecurityMaster.InvestmentProduct> investmentProducts = new ArrayList<EPIDataResponse.SecurityMaster.InvestmentProduct>();
        // new query to retrieve investment product from the new EPIInvestmentProducts table
        String query = "select investmentcode, exchange, \"name\", nativecountry, nativecurrency, \"type\", status, unitised \n" +
                "from EPIInvestmentProducts\n";
        Map<String, String> params = new HashMap<>();
        List<Map<String, Object>> rows = sharesTemplate.queryForList(query, params);
        for (Map row : rows) {
            EPIDataResponse.SecurityMaster.InvestmentProduct investmentProduct = new EPIDataResponse.SecurityMaster.InvestmentProduct();
            investmentProduct.setInvestmentCode(String.valueOf(row.get("investmentcode")));
            investmentProduct.setExchange(String.valueOf(row.get("exchange")));
            investmentProduct.setName(String.valueOf(row.get("name")));
            investmentProduct.setNativeCountry(formatInvestmentProductCountry(String.valueOf(row.get("nativecountry"))));
            investmentProduct.setNativeCurrency(formatInvestmentProductCurrency(String.valueOf(row.get("nativecurrency"))));
            investmentProduct.setType(String.valueOf(row.get("type")));
            investmentProduct.setStatus(String.valueOf(row.get("status")));
            investmentProduct.setUnitised((Boolean) row.get("unitised"));
            investmentProducts.add(investmentProduct);
        }
        return investmentProducts;
    }

    private CurrencyCode formatInvestmentProductCurrency(String value) {
        try {
            return CurrencyCode.valueOf(value);
        } catch (Exception e) {
            return CurrencyCode.AUD;
        }
    }

    private Country formatInvestmentProductCountry(String value) {
        try {
            return Country.valueOf(value);
        } catch (Exception e) {
            return Country.AU;
        }
    }

    public List<EPIDataResponse.Accounts.AccountDetails.Account> getAccounts() {
        List<EPIDataResponse.Accounts.AccountDetails.Account> accounts = getAccountsByAdviserId(XPLAN_ADVISER);
        return accounts;
    }

    public List<EPIDataResponse.Accounts.AccountDetails.Account> getAccountsByAdviserId(String adviserId) {
        String orgCode = getOrgCodeFromAdviserId(adviserId);
        String advCode = getAdvCodeFromAdviserId(adviserId);

        // accountdetails.sql
        String query = "select c.clcode as id,\n" +
                "'INVESTMENT' as \"Type\",\n" +
                "'PARAMETER' as \"EPIProductCode\",\n" +
                "(case when c.\"cl-status\" = 'ACTIVE' then 'Open' else (case when c.\"cl-status\" = 'INACTIVE' then 'Closed' else (CASE WHEN c.\"cl-status\" = 'SUSPEND' THEN 'Suspended' ELSE 'Pending' end) end) end) as \"AccountStatus\",\n" +
                "'AUD' as \"AccountCurrency\",\n" +
                "'F' as \"Delete\"\n" +
                "\n" +
                "from shares.client c\n" +
                "join shares.advisor ad on ad.advisorid = c.advisorid\n" +
                "\n" +
                "where ad.advcode = :advCode\n" +
                "and ad.orgcode = :orgCode\n";

        Map<String, String> params = new HashMap<>();
        params.put("advCode", advCode);
        params.put("orgCode", orgCode);

        List<EPIDataResponse.Accounts.AccountDetails.Account> accounts = new ArrayList<>();
        List<Map<String, Object>> rows = sharesTemplate.queryForList(query, params);

        for (Map row : rows) {
            EPIDataResponse.Accounts.AccountDetails.Account account = new EPIDataResponse.Accounts.AccountDetails.Account();
            String clcode = String.valueOf(row.get("id"));
            Account.Type accType = formatAccountType(String.valueOf(row.get("Type")), clcode);
            account.setId(clcode);
            if (accType != null) {
                account.setType(accType);
            }
            account.setEPIProductCode(String.valueOf(row.get("EPIProductCode")));// Set by an input control to the XPlan extract.
            account.setAccountStatus(formatAccountStatus(String.valueOf(row.get("AccountStatus"))));
            account.setAccountCurrency(CurrencyCode.valueOf(String.valueOf(row.get("AccountCurrency"))));
            account.setOwners(formatAccountOwners(clcode)); // need to get owner
            account.setAdvisers(formatAccountAdvisers(clcode)); // need to get advisers
            account.setDelete(false); // hardcoded
            accounts.add(account);
        }
        return accounts;
    }

    private Account.Advisers formatAccountAdvisers(String clcode) {
        Account.Advisers advisers = new Account.Advisers();
        // accountadvisers.sql
        String query = "select  ad.orgcode||'-'||ad.advcode as id, 'T' as \"PrimaryAdviser\", '2018-01-01' as \"StartDate\"\n" +
                "FROM shares.client c \n" +
                "join shares.advisor ad on ad.advisorid = c.advisorid\n" +
                "where c.clcode = :clcode";
        Map<String, String> params = new HashMap<>();
        params.put("clcode", clcode);
        List<Map<String, Object>> rows = sharesTemplate.queryForList(query, params);
        for (Map row : rows) {
            Account.Advisers.Adviser adviser = new Account.Advisers.Adviser();
            adviser.setId(String.valueOf(row.get("id")));
            adviser.setPrimaryAdviser(true); // sql returns T
            adviser.setStartDate(getTime(String.valueOf(row.get("StartDate"))));
            advisers.getAdviser().add(adviser);
        }
        return advisers;
    }

    private static XMLGregorianCalendar getTime(String dateTime) {
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(dateTime);
        } catch (Exception e) {
            return null;
        }
    }

    private Account.Owners formatAccountOwners(String clcode) {
        Account.Owners owners = new Account.Owners();
        // accountowners.sql
        String query = "select p.id, p.party_name, p.party_type, prar.party_role_account_onboarding_rel_type, prar.party_role_account_rel_type\n" +
                "FROM party p \n" +
                "JOIN party_role pr on p.id = pr.party_id\n" +
                "join party_role_account_relationship prar on pr.id = prar.party_role_id\n" +
                "join account a on a.back_office = 'SHARES' and a.id = prar.account_id\n" +
                "where a.account_number = :clcode\n" +
                "and (party_type in ('COMPANY','TRUST','SUPERANNUATION_FUND') OR (party_type = 'PERSON' and prar.party_role_account_rel_type = 'OWNER' and (prar.party_role_account_onboarding_rel_type is null)))";

        Map<String, String> params = new HashMap<>();
        params.put("clcode", clcode);
        List<Map<String, Object>> rows = sharesTemplate.queryForList(query, params);
        for (Map row : rows) {
            Account.Owners.Owner owner = new Account.Owners.Owner();
            owner.setId(String.valueOf(row.get("id")));
            owners.getOwner().add(owner);
        }
        return owners;
    }

    private Account.AccountStatus formatAccountStatus (String value) {
        Account.AccountStatus accStatus = new Account.AccountStatus();
        accStatus.setStatus(value);
        return accStatus;
    }

    private Account.Type formatAccountType (String accType, String clcode) {
        if (accType.equalsIgnoreCase("INVESTMENT")) {
            Account.Type result = new Account.Type();

            // accounttype-investment.sql
            String query = "SELECT c.clcode as id, c.surname as \"Name\"\n" +
                    "FROM shares.client c \n" +
                    "where c.clcode = :clcode\n";

            Map<String, String> params = new HashMap<>();
            params.put("clcode", clcode);

            RowMapper<Account.Type.Investment> mapper = new RowMapper<Account.Type.Investment>() {
                @Override
                public Account.Type.Investment mapRow(ResultSet rs, int i) throws SQLException {
                    Account.Type.Investment investmentType = new Account.Type.Investment();
                    investmentType.setName(String.valueOf(rs.getString("Name")));
                    return investmentType;
                }
            };
            Account.Type.Investment investment = sharesTemplate.queryForObject(query, params, mapper);
            result.setInvestment(investment);
            return result;
        } else {
            // logging to say it's out of scope
        }
        return null;
    }


    public List<EPIDataResponse.Clients.Client> getClientsByAdviserId(String adviserId) {
        String orgCode = getOrgCodeFromAdviserId(adviserId);
        String advCode = getAdvCodeFromAdviserId(adviserId);

        // clients.sql
        String query = "\n" +
                "SELECT DISTINCT p.id, p.party_type\n" +
                "\n" +
                "FROM party p\n" +
                "JOIN party_role pr ON pr.party_id = p.id\n" +
                "JOIN party_role_account_relationship prar ON pr.id = prar.party_role_id\n" +
                "JOIN account a ON a.back_office = 'SHARES' AND a.id = prar.account_id -- We will be assuming a one to one relationship exists between Shares accounts and DCA accounts\n" +
                "JOIN shares.client c ON c.clcode = a.account_number\n" +
                "JOIN shares.advisor ad ON ad.advisorid = c.advisorid\n" +
                "\n" +
                "WHERE\n" +
                "ad.advcode = :advCode -- passed through from advisers.sql - advisercode\n" +
                "AND ad.orgcode = :orgCode -- passed through from advisers.sql - adviserorganisation\n" +
                "AND (party_type IN ('COMPANY','TRUST','SUPERANNUATION_FUND') OR (party_type = 'PERSON' AND prar.party_role_account_rel_type = 'OWNER' AND (prar.party_role_account_onboarding_rel_type IS NULL))) -- logic TBC";

        Map<String, String> params = new HashMap<>();
        params.put("orgCode", orgCode);
        params.put("advCode", advCode);

        List<EPIDataResponse.Clients.Client> clients = new ArrayList<>();
        List<Map<String, Object>> rows = sharesTemplate.queryForList(query, params);

        for (Map row : rows) {
            EPIDataResponse.Clients.Client client = new EPIDataResponse.Clients.Client();
            client.setId(String.valueOf(row.get("id")));
            final String CLIENT_TYPE = String.valueOf(row.get("party_type"));
            final String partyId = client.getId();
            switch (CLIENT_TYPE) {
                case "PERSON":
                    EntityPerson person = getPersonByPartyId(partyId);
                    client.setPerson(person);
                    break;
                case "COMPANY":
                    EntityOrganisation organisation = getOrganisationByPartyId(partyId);
                    client.setOrganisation(organisation);
                    break;
                case "TRUST":
                    EntityTrust trust = getTrustByPartyId(partyId);
                    client.setTrust(trust);
                    break;
                case "SUPERANNUATION_FUND":
                    EntitySuperfund superfund = getSuperFundByPartyId(partyId);
                    client.setSuperfund(superfund);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported client type: " + CLIENT_TYPE);
            }
            clients.add(client);
        }

        return clients;
    }

    private EntityOrganisation getOrganisationByPartyId(String partyId) {
        String query = "SELECT p.id AS \"clientid\", p.party_name AS \"Name\"\n" +
                "\n" +
                "FROM party p\n" +
                "\n" +
                "WHERE p.id = :partyId";

        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.valueOf(partyId));

        ContactDetails contactDetails = getContactDetailsByPartyId(partyId, ClientType.COMPANY);

        RowMapper<EntityOrganisation> mapper = new RowMapper<EntityOrganisation>() {
            @Override
            public EntityOrganisation mapRow(ResultSet rs, int i) throws SQLException {
                EntityOrganisation organisation = new EntityOrganisation();
                organisation.setName(String.valueOf(rs.getString("Name")));
                organisation.setContactDetails(contactDetails);
                return organisation;
            }
        };

        EntityOrganisation organisation = sharesTemplate.queryForObject(query, params, mapper);

        return organisation;
    }

    private EntityTrust getTrustByPartyId(String partyId) {
        String query = "SELECT p.id AS \"clientid\", p.party_name AS \"Name\"\n" +
                "\n" +
                "FROM party p\n" +
                "\n" +
                "WHERE p.id = :partyId";

        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.valueOf(partyId));
        RowMapper<EntityTrust> mapper = new RowMapper<EntityTrust>() {
            @Override
            public EntityTrust mapRow(ResultSet rs, int i) throws SQLException {
                EntityTrust entityTrust = new EntityTrust();
                entityTrust.setName(String.valueOf(rs.getString("Name")));
                return entityTrust;
            }
        };
        EntityTrust trust = sharesTemplate.queryForObject(query, params, mapper);
        return trust;
    }

    private EntitySuperfund getSuperFundByPartyId(String partyId) {
        String query = "SELECT p.id AS \"clientid\", p.party_name AS \"Name\"\n" +
                "\n" +
                "FROM party p\n" +
                "\n" +
                "WHERE p.id = :partyId";

        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.valueOf(partyId));

        RowMapper<EntitySuperfund> mapper = new RowMapper<EntitySuperfund>() {
            @Override
            public EntitySuperfund mapRow(ResultSet rs, int i) throws SQLException {
                EntitySuperfund entitySuperfund = new EntitySuperfund();
                entitySuperfund.setName(String.valueOf(rs.getString("Name")));
                return entitySuperfund;
            }
        };

        EntitySuperfund superfund = sharesTemplate.queryForObject(query, params, mapper);

        return superfund;
    }

    private EntityPerson getPersonByPartyId(String partyId) {
        // persons.sql
        String query = "SELECT pe.last_name AS \"LastName\", pe.given_names AS \"FirstName\"\n" +
                "\n" +
                "FROM party p\n" +
                "JOIN person pe ON pe.id = p.id\n" +
                "\n" +
                "WHERE p.id = :partyId";
        Map<String, Integer> params = new HashMap<>();
        params.put("partyId", Integer.valueOf(partyId));


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
            } else if (clientType == ClientType.COMPANY || clientType == ClientType.TRUST || clientType == ClientType.SUPERANNUATION_FUND) {
                if (temp.getType() == AddressType.STREET) {
                    temp.setPreferred(true);
                }
            } else {
                temp.setPreferred(false);
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
