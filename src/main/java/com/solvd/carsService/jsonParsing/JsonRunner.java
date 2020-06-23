package com.solvd.carsService.jsonParsing;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.solvd.carsService.jsonParsing.Json.parse;



public class JsonRunner {
	private final static Logger LOGGER = LogManager.getLogger(JsonRunner.class);
    public static void main(String[] arg) {
        String jsonSource= "{\"title\": \"code\"}";
        try {
            JsonNode node = parse(jsonSource);
            LOGGER.debug(node.get("title").asText());
        }catch (IOException e){
        	LOGGER.debug("Error occurs:");
        }


    }
}
