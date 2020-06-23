package com.solvd.carsService.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BadEntryException extends Exception {
	private final static Logger LOGGER = LogManager.getLogger(BadEntryException.class);

	public BadEntryException(String errorMsj) {
		super(errorMsj);
		LOGGER.info(" ---  Wrong entry  ---");
	}

	public BadEntryException() {
		LOGGER.info(" ---  Wrong entry  ---");
	}

}
