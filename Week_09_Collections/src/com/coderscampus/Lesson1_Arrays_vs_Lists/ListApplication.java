package com.coderscampus.Lesson1_Arrays_vs_Lists;

import java.util.ArrayList;
import java.util.List;

public class ListApplication {
	public static void main(String[] args) {
		String[] names = new String[4];
		names[0] = "Trevor Page";
		names[1] = "Jane Doe";
		names[2] = "John Doe";
		names[3] = "Elon Musk";

		names[1] = null;

		for (String name : names) {
			System.out.println(name);

		}
		
		// Collections -> Java solution to common data structure problems
		// List (a type of Collection)
		// Set (a type of Collection)
		// Map (a type of Collection)
		
		List<String> elements = new ArrayList<String>();
	}

}
