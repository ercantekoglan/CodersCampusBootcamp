package com.coderscampus.Lesson5_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dogi_Alistirma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cumleyi Giriniz");
		String input = scanner.nextLine();
		scanner.close();

		charFrekans(input);
		wordFrekans(input);
	}

	private static void charFrekans(String input) {

		Map<Character, Integer> frekans = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (frekans.containsKey(c)) {
				frekans.replace(c, frekans.get(c) + 1);
			} else {
				frekans.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
			System.out.println("Karakter: " + entry.getKey() + " " + entry.getValue() + " kadar geciyor.");
		}
	}

	private static void wordFrekans(String input) {

		Map<String, Integer> frekans = new HashMap<>();

		String[] words = input.split(" ");

		for (String word : words) {
			if (frekans.containsKey(word))
				frekans.put(word, frekans.get(word) + 1);

			else
				frekans.put(word, 1);
		}

		System.out.println(frekans);
	}

}
