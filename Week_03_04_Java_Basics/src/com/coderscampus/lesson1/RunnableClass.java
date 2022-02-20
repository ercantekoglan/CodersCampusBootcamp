package com.coderscampus.lesson1;

public class RunnableClass {

	public static void main(String[] args) {
		// Class -> Blueprint for an Object
		// Object -> a Noun, it's an instantiation of a Class
		
		// Data type, variable name, assignment operation
//		Random random = new Random();
//		
//		for (int i = 0; i<20; i = i + 1) {
//			System.out.println("Random number is " + random.nextInt(10)); 
//		}
		
		// Call the no arg constructor
		//Human someOtherHuman = new Human();
		
		// call the 4 arg constructor
		HumanA trevorPage = new HumanA("male", "5'10\"", "160", "brown");
		
		System.out.println(trevorPage.getInfo());
		
		HumanA elonMusk = new HumanA("male", "6'1\"", "190", "blue");
		
		System.out.println(elonMusk.getInfo());
		
		HumanA christinaPage = new HumanA("female", "5'5\"", "130", "brown");
		
		System.out.println(christinaPage.getInfo());
	}

}