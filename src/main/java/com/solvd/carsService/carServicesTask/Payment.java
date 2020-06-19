package com.solvd.carsService.carServicesTask;

public abstract class Payment {
	private String payMethod;
	private double amount;

	public Payment(String payMethod, double amount) {
		this.payMethod = payMethod;
		this.amount = amount;
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