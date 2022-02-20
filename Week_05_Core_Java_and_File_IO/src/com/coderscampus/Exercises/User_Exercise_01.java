package com.coderscampus.Exercises;

public class User_Exercise_01 {

	private String userName;
	private String password;
	private String name;

	public User_Exercise_01(String name, String userName, String password) {
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "Name: " + this.name + "\n" + "Username: " + this.userName + "\n" + "Password: " + this.password + "\n";

	}

}