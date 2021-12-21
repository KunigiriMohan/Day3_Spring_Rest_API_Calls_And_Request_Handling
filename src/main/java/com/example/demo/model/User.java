package com.example.demo.model;


/**
 * UserClass for defining first name and last name
 */
public class User {

	private String firstName;
	private String lastName;
	
	/**
	 * Getters and setters of variables
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String secondName) {
		this.lastName = secondName;
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
		
	}
	/**
	 * @Overriding toString() method
	 */
	@Override
	public String toString() {
		String str = (firstName != null) ? firstName +" ": " ";
		str += (lastName != null) ? lastName :"";
		return str.trim();
	}
	
	
}
