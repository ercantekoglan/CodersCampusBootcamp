package com.coderscampus.Exercises;

import java.util.Scanner;

public class LoopInput02 {

	public static void main(String[] args) {

		userInput("Type a number between 50 and 300");

	}

	public static int userInput(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println(message);
			String userInput = scanner.nextLine();
			int convertedInput = Integer.parseInt(userInput);

			if (convertedInput <= 300 && convertedInput >= 50) {
				System.out.println("The number you typed in was: " + convertedInput);
				return convertedInput;
			} else {
				System.out.println(
						"Oops, that number wasn't between 50 and 300, try again:\n--------------------------------");
			}

		}

	}

}
