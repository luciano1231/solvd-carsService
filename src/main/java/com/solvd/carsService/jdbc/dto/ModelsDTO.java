package com.solvd.carsService.jdbc.dto;

public class ModelsDTO {
	private String id;
	private String description;
	
	
	public ModelsDTO(){		
	}


	public ModelsDTO(String id) {
		super();
		this.id = id;
	}

	public ModelsDTO(String id, String description) {
		super();
		this.id = id;
		this.description = description;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

}
