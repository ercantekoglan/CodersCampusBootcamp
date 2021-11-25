package com.coderscampus.Assignment3;

public class User {
	private String username;
	private String password;
	private String name;

	public User(String[] info) {
		this.username = info[0];
		this.password = info[1];
		this.name = info[2];
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + "]";
	}
}