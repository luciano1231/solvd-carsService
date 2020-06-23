package com.solvd.carsService.carServicesTask;

import com.solvd.carsService.enumTask.UserAccesLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "userID", "userName", "userEmail", "userContact", "licenceNumber" })
public class Driver extends User {

	private final static Logger LOGGER = LogManager.getLogger(Driver.class);

	private int licenceNumber;
	private int currentDistance;

	public Driver(int userID, String userName, String userEmail, int userContact, int licenceNumber,
			int currentDistance) {
		super(userID, userName, userEmail, userContact);
		this.setLicenceNumber(licenceNumber);
		this.setCurrentDistance(currentDistance);
	}

	public Driver() {
	}

	private void setCurrentDistance(int currentDistance) {

		this.currentDistance = currentDistance;
	}

	public int getLicenceNumber() {

		return licenceNumber;
	}

	public int getCurrentDistance() {

		return currentDistance;
	}

	public void setLicenceNumber(int licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	@Override
	public void showDetails() {
		LOGGER.info("- The Driver is:" + this.getName());
	}

	public int calculateDistance(int currentDistance, int a) {
		return a - currentDistance;
	}

	@SuppressWarnings("null")
	public static LinkedList<Driver> driverList() {

		LinkedList<Driver> drivers = new LinkedList<Driver>();

		LOGGER.debug("Creating drivers");

		drivers.add(new Driver(0002, "Jason King", "jsonking@outlook.com", 3352211, 8528524, 50));
		drivers.add(new Driver(0002, "Jason King", "jsonking@outlook.com", 3352211, 8528524, 50));
		drivers.add(new Driver(0002, "Jason King", "jsonking@outlook.com", 3352211, 8528524, 50));
		drivers.add(new Driver(0003, "Snow Kevin", "jsonking@outlook.com", 2113352, 5248528, 100));
		drivers.add(new Driver(0004, "George Lucas", "jsonking@outlook.com", 3352211, 5288524, 150));
		drivers.add(new Driver(0005, "Terry Bogard", "jsonking@outlook.com", 5223311, 1028524, 250));
		drivers.add(new Driver(0006, "Iory Yagami", "jsonking@outlook.com", 2233511, 5111524, 80));
		drivers.add(new Driver(0007, "Johnny Cage", "jsonking@outlook.com", 1152211, 0000024, 30));
		drivers.add(new Driver(0000, "Chris Redfield", "jsonking@outlook.com", 999211, 9858824, 10));
		drivers.add(new Driver(0001, "Clark Kent", "jsonking@outlook.com", 4442211, 2232214, 150));

		LOGGER.debug("Lots of Drivers added");

		return drivers;

	}

	public Driver nearDriver(Driver[] drivers, int userLocation) {
		// Seeking for the nearest driver in a list of Drivers
		int min = 999;
		int chosen = 0;
		int i = 0;
		for (i = 0; i <= 6; i++) {

			if (i == 7) {
				i = 0;
			}
			// Compares distances
			if (Math.abs(drivers[i].calculateDistance(drivers[i].getCurrentDistance(), userLocation)) <= min) {
				min = Math.abs(drivers[i].calculateDistance(drivers[i].getCurrentDistance(), userLocation));
				chosen = i;
			} else {
				i++;
			}
		}
		LOGGER.info("- The nearest driver is " + drivers[chosen].getName());
		LOGGER.info("- License N�: " + drivers[chosen].getLicenceNumber());
		return drivers[chosen];
	}

	@Override
	public String myAccessLevel() {
		UserAccesLevel ual = UserAccesLevel.CUSTOMEZED;
		return ual.getSt();
	}
}
