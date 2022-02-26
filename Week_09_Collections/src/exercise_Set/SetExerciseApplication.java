package exercise_Set;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SetExerciseApplication {

	// instatiate new hashset
	public static Set<String> hands = new HashSet<String>();
	static String s1 = "QUEEN HIGH";
	static String s2 = "ACE HIGH";

	public static void main(String[] args) throws IOException {

		String fileName = "PokerHands.csv";
		// extract the data from the CSV
		extractDataFromCSV(fileName);
		printToConsole();
		System.out.println("========================================");
		// remove ACE HIGH and QUEEN HIGH
		remove(s1);
		remove(s2);
		printToConsole();
		// Update PAIR to DEUCES
		update();
		System.out.println("========================================");
		printToConsole();
	}

	public static void printToConsole() {
		for (String s : hands) {
			System.out.println(s);
		}
	}

	public static void update() {
		hands.remove("PAIR");
		hands.add("DEUCES");
	}

	public static void remove(String s1) {
		hands.remove(s1);
	}

	public static Set<String> extractDataFromCSV(String fileName) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				String[] rows = line.split(",");
				hands.add(rows[1]);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br.readLine() == null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}