package com.solvd.carsService.staxParsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxHandler {
/*
	public StringBuffer processXMLFile(File xMLFile) throws FileNotFoundException, XMLStreamException, FactoryConfigurationError {
		XMLEvent xMLEvent = null;
		Characters character = null;
		StringBuffer  rawXML = new StringBuffer();
		XMLEventReader xMLEventReader = XMLInputFactory.newInstance().createXMLEventReader(new FileInputStream(xMLFile));
		while (xMLEventReader.hasNext()) {
			xMLEvent = xMLEventReader.nextEvent();
			switch (xMLEvent.getEventType()) {
			case XMLStreamConstants.START_ELEMENT:
				rawXML.append("<"+(((StartElement) xMLEvent).getName()).getLocalPart()+">");
				break;
			case XMLStreamConstants.CHARACTERS:
				charecters = (Charecters) xMLEvent;
				if (!(characters.))
				
				break; 
			case XMLStreamConstants.END_ELEMENT:
			rawXML.append("<"+(((StartElement) xMLEvent).getName()).getLocalPart()+">");
				break;
				
			}
			
		}
		
		
		return null;
	}
	*/

}
