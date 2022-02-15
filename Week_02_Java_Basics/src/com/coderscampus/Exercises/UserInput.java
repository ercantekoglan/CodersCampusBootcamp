package com.coderscampus.Exercises;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String input = scanner.nextLine();
		int convertedInput  = Integer.parseInt(input);
		
		if(convertedInput  <= 300 && convertedInput >=50) {
			System.out.println(convertedInput );
		}else {
			System.out.println("No!");
		}
		
		scanner.close();

	}

}