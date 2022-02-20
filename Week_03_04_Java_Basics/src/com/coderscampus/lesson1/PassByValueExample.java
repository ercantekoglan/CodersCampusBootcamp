package com.coderscampus.lesson1;

public class PassByValueExample {

	public static void main (String[] args) {
		int i = 0;
		System.out.println("Outside of the modifyValues method, i = " + i);
		
		modifyValues(i);
		
		System.out.println("Outside of the modifyValues method, i = " + i);
	}
	
	public static void modifyValues (int i) {
		System.out.println("Inside of the modifyValues method, i = " + i);
		i = i + 10;
		System.out.println("Inside of the modifyValues method, i = " + i);
	}
}