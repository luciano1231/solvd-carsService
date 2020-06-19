package com.solvd.carsService.myBatis.models;


public class Location {
    private Long id;
    private String city;
    private String street;
    private int locationID;
    private int streetNumber;

    public Location(Long id,String city, String street, int locationID, int streetNumber) {

        this.id = id;
        this.city = city;
        this.street = street;
        this.locationID = locationID;
        this.streetNumber = streetNumber;
    }
    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
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