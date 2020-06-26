package com.solvd.carsService.jdbc.dto;

public class ModelsDTO {
	private Long id;
	private String description;
	
	
	public ModelsDTO(){		
	}

	public ModelsDTO(Long id) {
		super();
		this.id = id;
	}

	public ModelsDTO(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

}
