package com.solvd.carsService.enumTask;

public enum UserAccesLevel {
    FULL ("Admin"),
    CUSTOMEZED("Driver"),
    RESTRINGED("Customer");

    private String st;

    private UserAccesLevel(String st) {

        this.setSt(st);
    }

    public String getSt() {

        return st;
    }

    public void setSt(String st) {

        this.st = st;
    }

}
