package com.solvd.carsService.readingTextFile;

import static org.apache.commons.io.FileUtils.readFileToString;
import static org.apache.commons.io.FileUtils.touch;
import static org.apache.commons.io.FileUtils.writeStringToFile;
import static org.apache.commons.lang3.StringUtils.strip;
import static org.apache.commons.lang3.time.DateUtils.parseDate;
import java.text.ParseException;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextRunner {

	private final static Logger LOGGER = LogManager.getLogger(TextRunner.class);

	public static void main(String[] args) {

		String text = null;
		Map<String, Integer> wordList = new HashMap<String, Integer>();

		try {
			File textFile = new File("src/main/resources/text.txt");
			text = readFileToString(textFile, "utf-8");
		} catch (Exception e) {
			LOGGER.error(e);
		}

		text = text.toLowerCase();
		String[] words = text.split("( |\t|\n|\r)+");

		for (String word : words) {
			String strippedWord = strip(word, "|°¬!\"#/()='?\\¿¡´¨+*~{[^}]`,;.:-_");
			int wordCount = 0;
			
			try {
				strippedWord = parseDate(strippedWord, "dd/mm/yyyy", "dd-mm-yyyy").toString();
			} catch (ParseException e) { }

			if (!wordList.containsKey(strippedWord)) {
				wordList.put(strippedWord, 1);
			} else {
				wordCount = wordList.get(strippedWord) + 1;
				wordList.put(strippedWord, wordCount);
			}
		}

		Map<String, Integer> wordListOrdered = sortByValue(wordList);

		try {
			File textFile = new File("src/main/resources/textResult.txt");
			touch(textFile);

			String textOut = "";

			for (Map.Entry<String, Integer> entry : wordListOrdered.entrySet()) {
				String key = entry.getKey();
				Integer value = entry.getValue();

				textOut = textOut + key.toString() + " " + value.toString() + "\n";
			}
			writeStringToFile(textFile, textOut, "utf-8");
		} catch (Exception e) {
			LOGGER.error(e);
		}
		LOGGER.info(" Text processing has been successfully completed");

	}

	public static Map<String, Integer> sortByValue(Map<String, Integer> hm) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		Map<String, Integer> auxMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> element : list) {
			auxMap.put(element.getKey(), element.getValue());
		}
		return auxMap;
	}

}