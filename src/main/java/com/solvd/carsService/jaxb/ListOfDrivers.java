package com.solvd.carsService.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "driverList")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListOfDrivers {

	@XmlElement(name = "driver")
	private List<Drivers> driverList = null;

	public List<Drivers> getdriverList() {
		return driverList;
	}

	public void setdriverList(List<Drivers> driverList) {
		this.driverList = driverList;
	}
}
