package com.solvd.carsService.linkedList;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedListTask {
	private final static Logger LOGGER = LogManager.getLogger(LinkedListTask.class);

	public static void main(String[] args) {

		LinkedList<String> words = new LinkedList<String>();

		words.add("A");
		words.add("C");
		words.add("F");
		words.add("H");
		words.add("J");
		words.add("L");
		words.add("N");
		LOGGER.info("Lists size is: " + words.size());

		ListIterator<String> iter = words.listIterator();
		// it.next();

		LOGGER.info("The new list is: ");
		for (String word : words) {
			LOGGER.info(word);
		}
		// Adding a element to the middle of the list

		try {
			Scanner myEscaner;
			int listPosition;
			LOGGER.info("In which position do you want to add an element)");
			myEscaner = new Scanner(System.in);
			listPosition = myEscaner.nextInt();
			String letter;
			LOGGER.info("Which letter do you want to add?");
			letter = myEscaner.next().toUpperCase();
			if (listPosition < words.size()) {
				for (int i = 0; i < listPosition; i++) {
					iter.next();
				}

				iter.add(letter);

			}
			LOGGER.info("The new list is: ");
			for (String word : words) {
				LOGGER.info(word);
			}
		} catch (InputMismatchException e) {
			LOGGER.info("Sorry bad entry)");
		}

	}

}
