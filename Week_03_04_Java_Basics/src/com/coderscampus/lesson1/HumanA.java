package com.coderscampus.lesson1;

public class HumanA {
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	HumanA () {
		System.out.println("A human is being created");
	}
	
	HumanA (String gender, String height, String weight, String eyeColor) {
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
	}
	
	// (visibility modifier), return type, method name, params, scope
	String getInfo () {
		return "Gender: " + gender + ", Height: " + height + 
			   ", Eye Color: " + eyeColor + ", Weight: " + weight;
	}
	
}