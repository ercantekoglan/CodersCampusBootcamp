package exercise_Map;

import java.io.*;
import java.util.*;

public class Main {

	static Map<String, Integer> players = new HashMap<String, Integer>();

	public static void main(String[] args) {
		String newString = "Zordon";
		String oldString = "Rita Repulsa";
		String updateValue = "He Man";
		String removeValue = "He Man";

		readFile();
		System.out.println(" ");
		updateRita(newString, oldString);
		System.out.println(" ");
		valueUpdate(updateValue);
		System.out.println(" ");
		removeValue(removeValue);

	}

	private static void removeValue(String removeValue) {
		players.remove(removeValue);
	}

	private static void valueUpdate(String updateValue) {
		players.replace(updateValue, players.get(updateValue), players.get(updateValue) + 1);
		display();

	}

	private static void updateRita(String newString, String oldString) {

		players.put(newString, players.get(oldString));
		removeValue(oldString);
		display();
	}

	private static void display() {
		for (String key : players.keySet()) {
			System.out.println(key + " -> " + players.get(key));
		}
	}

	private static void readFile() {
		BufferedReader br = null;

		try {

			String line = null;

			br = new BufferedReader(new FileReader("hands.csv"));
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] rows = line.split(",");

				if (rows[1].equals("FLUSH")) {
					if (players.containsKey(rows[0])) {
						players.put(rows[0], players.get(rows[0]) + 1);
					} else {
						players.put(rows[0], 1);
					}

				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		display();
	}

}