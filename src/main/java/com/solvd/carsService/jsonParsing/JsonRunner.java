package com.solvd.carsService.jsonParsing;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.carsService.jaxb.Drivers;

public class JsonRunner {

	private final static Logger LOGGER = LogManager.getLogger(JsonRunner.class);

	public static void readJson() {

		ObjectMapper objectMapper = new ObjectMapper();
		List<Drivers> people = null;
		try {
			InputStream inputStream = new FileInputStream("src/main/resources/listOfDrivers.json");
			people = objectMapper.readValue(inputStream, new TypeReference<List<Drivers>>() {
			});
		} catch (Exception e) {
			LOGGER.error(e);
		}
		people.forEach(p -> LOGGER.info(p.toString()));

	}

	public static <T> void writeJson(List<T> drivers, String file) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.writeValue(new File(file), drivers);
		} catch (JsonMappingException e) {
			LOGGER.error(e);
		} catch (IOException e) {
			LOGGER.error(e);
		}
	}

}
