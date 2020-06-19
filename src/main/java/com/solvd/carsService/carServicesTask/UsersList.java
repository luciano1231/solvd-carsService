package com.solvd.carsService.carServicesTask;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class UsersList {
	
	private List<User> users;
	public UsersList() {
		// TODO Auto-generated constructor stub
	}
	public List<User> getUsers() {
		return users;
	}
	@XmlElement(name="user")
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
