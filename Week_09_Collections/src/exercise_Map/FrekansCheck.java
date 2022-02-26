package exercise_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrekansCheck {
	
	private String words;
	private String input;

	public FrekansCheck(String words, String input) {

		this.words = words;
		this.input = input;
	}

	public int wordFrekans() {

		Map<String, Integer> frekans = new HashMap<>();

		String[] wordList = input.split(" ");

		for (String word : wordList) {
			if (frekans.containsKey(word))
				frekans.put(word, frekans.get(word) + 1);

			else
				frekans.put(word, 1);
		}
		
		for (Entry<String, Integer> entry : frekans.entrySet()) {
			System.out.println("Word: " + entry.getKey() + " " + entry.getValue() + " times.");
		}

		return frekans.get(words);
	}
}
