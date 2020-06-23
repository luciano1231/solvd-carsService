package com.solvd.carsService.myBatis.models;

import com.solvd.carsService.carServicesTask.Client;
import com.solvd.carsService.carServicesTask.Driver;
import com.solvd.carsService.carServicesTask.Payment;

public class Ride {
    private int origin;
    private int destination;
    private double distance;
    private double amount;
    private Long id;

    public Ride(int origin, int destination, double amount, double distance, Driver newDriver, Payment newPayment,
                Client newClient) {
        this.origin = origin;
        this.destination = destination;
        this.amount = amount;
        this.distance = distance;

    }
    public Ride() {
        // TODO Auto-generated constructor stub
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrigin() {

        return origin;
    }

    public void setOrigin(int origin) {

        this.origin = origin;
    }

    public int getDestination() {

        return destination;
    }

    public void setDestination(int destination) {

        this.destination = destination;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public double getDistance() {

        return distance;
    }

    public void setDistance(double distance) {

        this.distance = distance;
    }
}
