package com.solvd.carsService.carServicesTask;

public class Location {

	private String city;
	private String street;
	private int locationID;
	private int streetNumber;

	public Location(String city, String street, int locationID, int streetNumber) {

		this.city = city;
		this.street = street;
		this.locationID = locationID;
		this.streetNumber = streetNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

}
