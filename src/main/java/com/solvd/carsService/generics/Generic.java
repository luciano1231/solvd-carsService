package com.solvd.carsService.generics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Generic<T> {
	private final static Logger LOGGER = LogManager.getLogger(Generic.class);

	private T object;
	
	public Generic(T object) {
	
		this.object = object;
	 	}

	public Generic(int userID, String userName, String userEmail, int userContact) {
		// TODO Auto-generated constructor stub
	}

	public void showType() {
		LOGGER.info("Test Name for this class "+object.getClass().getName());
	}

}
