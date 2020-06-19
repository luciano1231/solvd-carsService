package com.solvd.carsService.carServicesTask;

import java.util.Scanner;

import com.solvd.carsService.enumTask.UserAccesLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client extends User {
	private final static Logger LOGGER = LogManager.getLogger(Client.class);

	public Client(int userID, String userName, String userEmail, int userContact) {
		super(userID, userName, userEmail, userContact);
	}

	public Client() {
		super();
	}

	@Override
	public void showDetails() {
		LOGGER.info("- The Driver is:" + this.getName());
	}

	public static Client newClient() {
		Scanner myEscaner = new Scanner(System.in);
		LOGGER.info(" ---       UBER       ---");
		LOGGER.debug(" --- Please Register ---");

		LOGGER.debug(" --- Enter your Name ---");
		String userName = myEscaner.next();

		LOGGER.debug(" --- Enter a new ID number ---\n");
		int userID = myEscaner.nextInt();

		LOGGER.debug(" --- Enter email ---");
		String userEmail = myEscaner.next();

		LOGGER.debug(" --- Enter contact number ---");
		int userContact = myEscaner.nextInt();

		Client newClient = new Client(userID, userName, userEmail, userContact);
		// myEscaner.close();
		return newClient;

	}

	public int getHomeLocation() {
		Scanner myEscaner = new Scanner(System.in);

		LOGGER.debug(" --- Enter your home location with number ---");
		int homeLocation = myEscaner.nextInt();
		return homeLocation;
	}

	@Override
	public String myAccessLevel() {
		UserAccesLevel ual = UserAccesLevel.RESTRINGED;
		return ual.getSt();
	}

}
