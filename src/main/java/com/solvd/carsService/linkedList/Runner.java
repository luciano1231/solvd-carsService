package com.solvd.carsService.linkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

	private final static Logger LOGGER = LogManager.getLogger(Runner.class);

	public static void main(String[] args) {
		LinkedList<String> theLinkedList = new LinkedList<>();

		theLinkedList.add("Diego");
		theLinkedList.add("Luciano");
		theLinkedList.add("Ana");
		theLinkedList.add("Laura");
		theLinkedList.add("Cristian");
		theLinkedList.add("Blair");
		theLinkedList.add("Delia");
		theLinkedList.remove("Roberto");
		theLinkedList.add("Juan");
		theLinkedList.add("Fabian");
		theLinkedList.add("Jesica");	
		
		LOGGER.info("Original List: " + theLinkedList.toString());
		LOGGER.info("Reversed list: " + theLinkedList.reverse().toString());
	}

}
