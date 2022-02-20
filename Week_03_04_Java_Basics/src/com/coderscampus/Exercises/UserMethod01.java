package com.coderscampus.Exercises;

import java.util.Scanner;

public class UserMethod01 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type a number between 50 and 300");
		String input = scanner.nextLine();
		int convertedInput  = Integer.parseInt(input);
		userInput(convertedInput);

		scanner.close();
	}
	
	public static int userInput(int i) {
		
		
		if(i  <= 300 && i >=50) {
			System.out.println("The number you typed in was: " + i);
			
		}else {
			System.out.println("The number you typed in was: " + null);

		}
		
		return i;
	}

}
