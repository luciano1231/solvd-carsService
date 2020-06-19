package com.solvd.carsService.carServicesTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IUberInterface {
	private final static Logger LOGGER = LogManager.getLogger(IUberInterface.class);

	public static void main(String[] args) {
		LOGGER.info(" ---       UBER       ---");

		Ride.newRide();

	}

}
