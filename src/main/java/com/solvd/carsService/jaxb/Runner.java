package com.solvd.carsService.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Runner {
	private final static Logger LOGGER = LogManager.getLogger(Runner.class);

	public static void main(String[] args) {
		try {
			File file = new File("src/main/resources/listOfDrivers.xml");
			JAXBContext context = JAXBContext.newInstance(ListOfDrivers.class);
			Unmarshaller unm = context.createUnmarshaller();

			ListOfDrivers listOfDrivers = (ListOfDrivers) unm.unmarshal(file);

			LOGGER.info(listOfDrivers);

			for (Drivers p : listOfDrivers.getdriverList()) {
				LOGGER.info(p);
			}
		} catch (JAXBException e) {
			LOGGER.error(e);
		}
	}
}
