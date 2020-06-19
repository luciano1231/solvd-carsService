package com.solvd.carsService.jsonParsing;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class Json {
    private static ObjectMapper objectMapper = getDedaultObjectMapper();
    private static ObjectMapper getDedaultObjectMapper(){
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        //---
        return defaultObjectMapper;
    }

    //Parsing from Json String to Json Node
    public static JsonNode parse(String src) throws IOException {
        return objectMapper.readTree(src);
    }
}
