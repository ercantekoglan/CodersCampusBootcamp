package com.coderscampus.Assignment3;

public class UserValidation {

	public User UserValidation(String username, String password) {

		for (User user : Main.users) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return user;
			}

		}
		return null;

	}
}
