package com.coderscampus.Assignment3;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static User[] users = new User[4];

	public static void main(String[] args) throws IOException {

		fileReader();
		loginCheck();

	}

	private static void fileReader() throws FileNotFoundException, IOException {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("data.txt"));
			String line = null;
			int i = 0;
			while ((line = br.readLine()) != null) {
				users[i] = new User(line.split(","));
				System.out.println(users[i]);
				i++;
			}
		} finally {
			if (br != null)
				br.close();
		}

	}

	private static void loginCheck() {

		Scanner scanner = new Scanner(System.in);
		boolean control = true;
		int loginAttemp = 0;

		while (control && loginAttemp < 5) {

			System.out.println("Enter your Username: ");
			String username = scanner.nextLine();
			System.out.println("Enter your Password: ");
			String password = scanner.nextLine();

			User checkedUser = new UserValidation().UserValidation(username, password);

			if (checkedUser != null) {
				System.out.println("Welcome: " + checkedUser.getName());
				control = false;
			} else {
				System.out.println("Invalid login please try again ");
				loginAttemp++;
				if (loginAttemp >= 5) {
					System.out.println("Too many failed login attempts, you are now locked out.");

				}
			}
		}
		scanner.close();
	}
}
