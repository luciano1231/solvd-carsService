package com.solvd.carsService.carServicesTask;

import com.solvd.carsService.lambdaTask.CalculateMount;

public class CreditCard extends Payment {

	public CreditCard(String payMethod, double amount) {
		super(payMethod, amount);	
	}

	// My Lambda expr.
	@Override
	public double calculate(double number) {
		CalculateMount calc = (double x) -> (x * 1.3);
		return calc.mount(number);
	}

}
