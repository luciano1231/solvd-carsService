package com.solvd.carsService.jaxb;

import java.time.LocalDate;
import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "drivers")
public class Drivers {

	@JsonProperty("drivers_id")
	private Long id;

	private String name;

	private String licence;

	@JsonProperty("birth_date")
	private LocalDate birthDate;

	@JsonProperty("sex_id")
	private Long sexId;

	private Long countryId;

	public Drivers() {
	}

	public Drivers(Long id, String name, String licence, LocalDate birthDate, Long sexId, Long countryId) {
		this.id = id;
		this.name = name;
		this.licence = licence;
		this.birthDate = birthDate;
		this.sexId = sexId;
		this.countryId = countryId;
	}

	@XmlAttribute
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return licence;
	}

	public void setSurname(String licence) {
		this.licence = licence;
	}

	@XmlElement(name = "birth_date")
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@XmlElement(name = "sex_id")
	public Long getSexId() {
		return sexId;
	}

	public void setSexId(Long sexId) {
		this.sexId = sexId;
	}

	@XmlElement(name = "country_id")
	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	@Override
	public String toString() {
		return "Drivers [id=" + id + ", name=" + name + ", licence=" + licence + ", birthDate=" + birthDate + ", sexId="
				+ sexId + ", countryId=" + countryId + "]";
	}

	@JsonProperty("country")
	private void unpackCountry(Map<String, Object> country) {
		this.countryId = Long.valueOf((int) country.get("id"));
	}
}