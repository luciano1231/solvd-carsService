package com.solvd.carsService.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestJDBC {
	private final static Logger LOGGER = LogManager.getLogger(TestJDBC.class);

	public TestJDBC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			// Creating connection

			LOGGER.info("Try connection");

			Connection cnn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mydb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"lucianoArg", "1231");

			LOGGER.info("Connected");
			// Statement
			Statement stm = cnn.createStatement();

			// SQL Commands
			// ResultSet for table like model
			ResultSet resulset = stm.executeQuery("SELECT * FROM mydb.models");

			while (resulset.next()) {
				LOGGER.info(resulset.getString("id") + " " + resulset.getString("description"));
			}

		} catch (Exception e) {
			LOGGER.info("No ERROR");

		}

	}

}
