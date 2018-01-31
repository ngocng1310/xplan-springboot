package com.gbst.customdatasource.xplan;

import com.gbst.customdatasource.xplan.database.DatabaseOperations;
import com.gbst.customdatasource.xplan.domain.Client;
import com.gbst.customdatasource.xplan.domain.EPIDataResponse;
import com.gbst.customdatasource.xplan.domain.ObjectFactory;
import com.gbst.customdatasource.xplan.domain.Platform;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@SpringBootApplication
public class XplanApplication {

	private static DatabaseOperations databaseOperations = null;
	private static final String XPLAN_EXTRACT_TIME_FORMAT = "YYYY-MM-DDTHH:mm:ss";

	public static void main(String[] args) throws SQLException, DatatypeConfigurationException {
		ConfigurableApplicationContext context = SpringApplication.run(
				XplanApplication.class, args);

		databaseOperations = (DatabaseOperations) context
				.getBean("databaseOperations");

		File xmlDocument = new File("D://temp//datafeed.xml");
		generateXMLDocument(xmlDocument);
	}

	private static List<EPIDataResponse.Advisers.Adviser> getAdvisers() {
		return databaseOperations.getAdvisers();
	}

	private static List<EPIDataResponse.Accounts.AccountDetails.Account> getAccounts() {
		return databaseOperations.getAccounts();
	}

	private static List<EPIDataResponse.Clients.Client> getClientsByAdviserId(String adviserId) {
		return databaseOperations.getClientsByAdviserId(adviserId);
	}

	private static List<EPIDataResponse.SecurityMaster.InvestmentProduct> getInvestmentProducts() {
		return databaseOperations.getInvestmentProducts();
	}

	private static List<EPIDataResponse.Accounts.InvestmentHoldings.InvestmentHolding> getInvestmentHoldings() {
		return databaseOperations.getInvestmentHoldings();
	}

	private static List<EPIDataResponse.Accounts.MovementTransactions.MovementTransaction> getMovementTransaction() {
		return databaseOperations.getMovementTransaction();
	}

	private static List<EPIDataResponse.Accounts.AccountBalances.AccountBalance> getAccountBalances() {
		return databaseOperations.getAccountBalances();
	}

	private static List<EPIDataResponse.Advisers.Adviser> getAdvisersLinkedToClient(String partyId) {
		return null;
	}

	private static XMLGregorianCalendar getExtractRunTime() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DDThh:mm:ss");
			String date = sdf.format(new Date());
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
		} catch (Exception e) {
			return null;
		}
	}

	// TODO: retrieve the squence number from system
	// This is the number of files that have been supplied for the specified Extract Identifier. NOTE: Files delivered to Financial Planning Software must have sequential Sequence Numbers
	private static BigInteger getSequenceNum() {
		return BigInteger.valueOf(5);
	}

	// TODO: retrieve the resequence from input control if there is
	// The mere presence of this element, indicates that previous sequence numbers are to be ignored, and that this number is the next valid number
	private static String getReSequence() {
		return "2";
	}

	// TODO: retrieve the data from input control
	private static void setupProvider(Platform provider) {
		// A unique identifier for the Platform Provider
		provider.setEPIId("7");
		// Registered business name of the Platform Provider
		provider.setName("GBST");
	}

	private static void generateXMLDocument(File xmlDocument) throws DatatypeConfigurationException {
		ObjectFactory factory = new ObjectFactory();

		EPIDataResponse epiDataResponse = factory.createEPIDataResponse();

		// Refer to EPI 4.3.0 XML Data Mapping for more details

		// 1. Version of EPI that extract was created
		epiDataResponse.setVersion("4.3");
		// 2. The date and time at which the extract file / response was generated
		epiDataResponse.setDate(getExtractRunTime());
		// 3. The ExtractMethod element defines whether the extract was instigated via a request from the FPS (Web Service call) or generated as part of Providers daily processing
		EPIDataResponse.ExtractMethod extractMethod = factory.createEPIDataResponseExtractMethod() ;
		extractMethod.setSequenceNumber(getSequenceNum());
		extractMethod.setResequence(getReSequence());
		epiDataResponse.setExtractMethod(extractMethod);
		// 4. Details relating to the Data Provider
		Platform provider = factory.createPlatform();
		setupProvider(provider);
		epiDataResponse.setProvider(provider);
		// 5. Advisers - The adviser element details all information about an intermediary/Adviser
		// 6. Clients associated to the adviser
		EPIDataResponse.Advisers advisers = factory.createEPIDataResponseAdvisers();

		List<EPIDataResponse.Advisers.Adviser> adviserList = getAdvisers();
		for(EPIDataResponse.Advisers.Adviser adviser: adviserList) {
			advisers.getAdviser().add(adviser);
			EPIDataResponse.Clients clients = factory.createEPIDataResponseClients();
			List<EPIDataResponse.Clients.Client> clientList = getClientsByAdviserId(adviser.getId());
			for (EPIDataResponse.Clients.Client client : clientList) {
				clients.getClient().add(client);
			}
			epiDataResponse.setClients(clients);
		}
		epiDataResponse.setAdvisers(advisers);

		// 7. Accounts/Policies held by Clients under advice of the Adviser: account details, investment holding, movement transaction
		EPIDataResponse.Accounts accounts = factory.createEPIDataResponseAccounts();
		EPIDataResponse.Accounts.AccountDetails accountDetails = new EPIDataResponse.Accounts.AccountDetails();
		List<EPIDataResponse.Accounts.AccountDetails.Account> accountList = getAccounts();
		accountDetails.getAccount().addAll(accountList);
		accounts.setAccountDetails(accountDetails);

		EPIDataResponse.Accounts.InvestmentHoldings investmentHoldings = new EPIDataResponse.Accounts.InvestmentHoldings();
		List<EPIDataResponse.Accounts.InvestmentHoldings.InvestmentHolding> investmentHoldingsList = getInvestmentHoldings();
		investmentHoldings.getInvestmentHolding().addAll(investmentHoldingsList);
		accounts.setInvestmentHoldings(investmentHoldings);

		EPIDataResponse.Accounts.MovementTransactions movementTransactions = new EPIDataResponse.Accounts.MovementTransactions();
		List<EPIDataResponse.Accounts.MovementTransactions.MovementTransaction> movementTransactionList = getMovementTransaction();
		movementTransactions.getMovementTransaction().addAll(movementTransactionList);
		accounts.setMovementTransactions(movementTransactions);

		EPIDataResponse.Accounts.AccountBalances accountBalances = new EPIDataResponse.Accounts.AccountBalances();
		List<EPIDataResponse.Accounts.AccountBalances.AccountBalance> accountBalanceList = getAccountBalances();
		accountBalances.getAccountBalance().addAll(accountBalanceList);
		accounts.setAccountBalances(accountBalances);

		epiDataResponse.setAccounts(accounts);

		// 8. SecurityMaster - An investment product, is a investment (e.g. Share, Managed Fund, Bond, Option etc) that is offered within the Product
		EPIDataResponse.SecurityMaster securityMaster = factory.createEPIDataResponseSecurityMaster();
		List<EPIDataResponse.SecurityMaster.InvestmentProduct> investmentProducts = getInvestmentProducts();

		securityMaster.getInvestmentProduct().addAll(investmentProducts);
		epiDataResponse.setSecurityMaster(securityMaster);



		// generating the xml output
		JAXBContext context;
		try { //"com.gbst.reporting.datasource.report.xplan.datafeed"
			context = JAXBContext.newInstance(EPIDataResponse.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			try {
				marshaller.marshal(epiDataResponse, new FileOutputStream(xmlDocument));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (JAXBException e) {
			e.printStackTrace();
			// log.error("Can't create the epiValidateCredentialsResponse, error in marshaling XML data. Class=" + getClass().getName(), e);
		}
	}
}
