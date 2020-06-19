package com.solvd.carsService.carServicesTask;


import com.solvd.carsService.enumTask.UserAccesLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.carsService.lambdaTask.CalculateMount;
import com.solvd.carsService.lambdaTask.NameString;

public class Admin extends User{

	private final static Logger LOGGER = LogManager.getLogger(Admin.class);
	
	public Admin(int userID, String userName, String userEmail, int userContact) {
		super(userID, userName, userEmail, userContact);		
	}
	
	public Admin() {
	}
	
	//Simple Lambda example
	@Override
	public void showDetails() {
		NameString nString = (String x)-> ("\n Hello "+this.getName());
		LOGGER.debug(nString.nameString(this.getName()));
		LOGGER.debug( "\\n Entering the System please wait");
	}
	
	
	public double calculate(double number) {
		CalculateMount calc= (double x) -> (x*1.3);		
		return calc.mount(number);
			}
	


	@Override
	public String myAccessLevel() {
		UserAccesLevel ual = UserAccesLevel.FULL;
		return ual.getSt();
	}
	
	
		
}


