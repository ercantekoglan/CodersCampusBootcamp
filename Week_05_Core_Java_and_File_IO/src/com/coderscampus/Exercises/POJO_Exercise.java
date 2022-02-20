package com.coderscampus.Exercises;



public class POJO_Exercise {
	public static void main(String[] args) {
		
		
		User_Service_Excercise_02 userService = new User_Service_Excercise_02();
		User_Exercise_01 kullanici = userService.createUser(userService.parseText("evertone", "123456", "ercan"));
		System.out.println(kullanici.getUserName());
		
		//String[] userErcan = userService.parseText("evertone", "123456", "ercan");

		}

}
