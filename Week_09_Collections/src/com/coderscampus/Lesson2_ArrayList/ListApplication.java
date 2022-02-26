package com.coderscampus.Lesson2_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListApplication {
	public static void main(String[] args) {
		String[] names = new String[4];
		names[0] = "Trevor Page";
		names[1] = "Jane Doe";
		names[2] = "John Doe";
		names[3] = "Elon Musk";

		names[1] = null;

		System.out.println("Arrays example: ");
		for (String name : names) {
			System.out.println(name);

		}
		System.out.println("-------------");
		System.out.println("");
		// Collections -> Java solution to common data structure problems
		// List (a type of Collection)
		// Set (a type of Collection)
		// Map (a type of Collection)
		
		List<String> elements = new ArrayList<String>();
		elements.add("Trevor Page");
		elements.add("Jane Doe");
		elements.add("John Doe");
		elements.add("Elon Musk");
		elements.add("Josh Someone");
		
		System.out.println("List Example");
		printArrayListToConsole(elements);
		System.out.println("-------------");
		elements.remove("Josh Someone");
		printArrayListToConsole(elements);
		System.out.println("-------------");
		Iterator<String> iterator = elements.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next());

		}		
	}

	private static void printArrayListToConsole(List<String> elements) {
		for(String element : elements) {
			System.out.println(element);
			
		}
	}

}
