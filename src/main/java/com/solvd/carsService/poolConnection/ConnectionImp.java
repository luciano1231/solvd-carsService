package com.solvd.carsService.poolConnection;


import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionImp implements Connection {
	private final static Logger LOGGER = LogManager.getLogger(ConnectionImp.class);
	
	private ConnectionImp() {
	}
	
	static ConnectionImp getInstance() {
		return new ConnectionImp();
	}
	
	public void stablishConnection() throws InterruptedException {
		long connectionDuration = getRandomNumberInRange(1, 10) * 1000;
		LOGGER.debug("starting connection...");
		Thread.sleep(connectionDuration);
		LOGGER.debug("finished connection after: " + connectionDuration + " miliseconds");
		
	}
	
	private long getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
		
	}

}
