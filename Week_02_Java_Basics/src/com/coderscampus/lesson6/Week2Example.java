package com.coderscampus.lesson6;

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
		System.out.println("Type in your name: ");
		String name = scanner.nextLine();
		System.out.println("Type in your age: ");
		String age = scanner.nextLine();
		
		if (name.equals("Trevor") 
				|| age.equals("36")
				|| name.equals("TJ")) {
			System.out.println("Holy cow it's me!");
		} else {
			System.out.println("Hello: " + name);
		}
		
		scanner.close();
	}
}