package com.gbst.customdatasource.xplan;

import com.gbst.customdatasource.xplan.database.DatabaseOperations;
import com.gbst.customdatasource.xplan.domain.Client;
import com.gbst.customdatasource.xplan.domain.EPIDataResponse;
import com.gbst.customdatasource.xplan.domain.ObjectFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class XplanApplication {

	private static DatabaseOperations databaseOperations = null;

	public static void main(String[] args) throws SQLException, DatatypeConfigurationException {
		ConfigurableApplicationContext context = SpringApplication.run(
				XplanApplication.class, args);

		databaseOperations = (DatabaseOperations) context
				.getBean("databaseOperations");

		File xmlDocument = new File("C://test//datafeed.xml");
		generateXMLDocument(xmlDocument);
	}

	private static List<EPIDataResponse.Advisers.Adviser> getAdvisers() {
		return databaseOperations.getAdvisers();
	}

	private static List<EPIDataResponse.Clients.Client> getClientsByAdviserId(String adviserId) {
		return databaseOperations.getClientsByAdviserId(adviserId);
	}

	private static List<EPIDataResponse.Advisers.Adviser> getAdvisersLinkedToClient(String partyId) {
		return null;
	}

	private static void generateXMLDocument(File xmlDocument) throws DatatypeConfigurationException {
		ObjectFactory factory = new ObjectFactory();
		EPIDataResponse epiDataResponse = factory.createEPIDataResponse();

//        EPIDataResponse.ExtractMethod extractMethod = factory.createEPIDataResponseExtractMethod() ;
//        extractMethod.setSequenceNumber(getSequenceNum());
//        extractMethod.setResequence(getReSequence());

		EPIDataResponse.Advisers advisers = factory.createEPIDataResponseAdvisers();
		EPIDataResponse.Clients clients = factory.createEPIDataResponseClients();
		List<EPIDataResponse.Advisers.Adviser> adviserList = getAdvisers();
		for(EPIDataResponse.Advisers.Adviser adviser: adviserList) {
			advisers.getAdviser().add(adviser);
			List<EPIDataResponse.Clients.Client> clientList = getClientsByAdviserId(adviser.getId());
			for (EPIDataResponse.Clients.Client client : clientList) {
				clients.getClient().add(client);
			}
		}

//        epiDataResponse.setExtractMethod(extractMethod);
		epiDataResponse.setAdvisers(advisers);
		epiDataResponse.setClients(clients);


		JAXBContext context;
		try { //"com.gbst.reporting.datasource.report.xplan.datafeed"
			context = JAXBContext.newInstance(
					EPIDataResponse.class,
					EPIDataResponse.ExtractMethod.class,
					EPIDataResponse.Advisers.Adviser.class);

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
