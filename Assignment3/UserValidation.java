package com.coderscampus.Assignment3;

public class UserValidation {

	public User UserValidation(String username, String password) {

		for (User user : Main.users) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)) {
				return user;
			}

		}
		return null;

	}
}
