package com.solvd.carsService.carServicesTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.carsService.exceptions.ShortEmail;

public class IUberInterface {
	private final static Logger LOGGER = LogManager.getLogger(IUberInterface.class);

	public static void main(String[] args) throws ShortEmail {
		LOGGER.info(" ---       UBER       ---");

		Ride.newRide();

	}

}
