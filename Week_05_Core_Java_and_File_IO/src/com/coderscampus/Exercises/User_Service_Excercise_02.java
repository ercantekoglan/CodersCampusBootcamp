package com.coderscampus.Exercises;

public class User_Service_Excercise_02 {

	public User_Exercise_01 createUser(String[] stringInput) {

		return new User_Exercise_01(stringInput[2], stringInput[0], stringInput[1]);
	}

	public String[] parseText(String username, String password, String name) {

		String[] inputArray = { username, password, name };

		return inputArray;
	}

}