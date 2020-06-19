package com.solvd.carsService.readingTextFile;

import java.io.*;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import static org.apache.commons.io.FileUtils.readFileToString;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class FileToString {
    private final static Logger LOGGER = LogManager.getLogger(FileToString.class);
    File textFile = new File("src//main//resources//text.txt");
    private String[] separators =  {",",",",".",". ",";",":"," - ","(",")","\t","\n","\r"};
    String string = "";
    String text = readFileToString(textFile, "utf-8").toLowerCase();


    public String getText() {
        return text;
    }






    public FileToString() throws IOException {
    }
}
