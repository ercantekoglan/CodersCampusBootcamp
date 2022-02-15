package com.coderscampus.lesson5;

import java.util.Scanner;

public class Week2Example {

	public static void main (String[] args) {
		
		// This is just for teaching purposes ///////
		//  with respect to imports / packages     //
		// java.lang is by default imported for us //
		//java.lang.String aString = "Hello World";  //
		//String anotherString = "Another String";   //
		/////////////////////////////////////////////
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in any input:");
		String userInput = scanner.nextLine();
		
		System.out.println("You typed in: " + userInput);
		
		scanner.close();
	}
}
