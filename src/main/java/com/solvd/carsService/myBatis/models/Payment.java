package com.solvd.carsService.myBatis.models;

public class Payment {
    private Long id;
    private String payMethod;
    private double amount;

    public Payment(Long id, String payMethod, double amount) {
        this.id = id;
        this.payMethod = payMethod;
        this.amount = amount;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayMethod() {

        return payMethod;
    }

    public void setPayMethod(String payMethod) {

        this.payMethod = payMethod;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public double calculate(double amount) {

        return this.amount;
    }

}