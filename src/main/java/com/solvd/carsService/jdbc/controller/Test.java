package com.solvd.carsService.jdbc.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.carsService.carServicesTask.Admin;
import com.solvd.carsService.jdbc.dao.ModelsDAO;
import com.solvd.carsService.jdbc.dto.ModelsDTO;

public class Test {
	private final static Logger LOGGER = LogManager.getLogger(Admin.class);


	public static void main (String []args) {
		ModelsDAO mdao = new ModelsDAO();
		
		ModelsDTO mdto = mdao.read("1");
		LOGGER.debug("logger");
		LOGGER.debug("The model for that ID is: ");
		LOGGER.debug(mdto.getDescription());
	}

}
