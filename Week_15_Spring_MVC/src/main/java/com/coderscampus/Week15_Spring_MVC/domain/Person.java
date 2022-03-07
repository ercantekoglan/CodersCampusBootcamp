package com.coderscampus.Week15_Spring_MVC.domain;

//database de tutlacak objeler domain de tutulur.
//domain package represents essentially what exists in a database its jus in java object format.
//dto vs domain ?
//domain objects stored in database, and retrieve from database,
//dto is just an object typically not persistent, not stored in database,it is just used to transfer data one place to another


public class Person {
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";	}

}
