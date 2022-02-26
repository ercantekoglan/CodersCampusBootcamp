package com.coderscampus.Lesson5_Map;

import java.util.HashMap;
import java.util.Map;

public class MapApplication {
	
	
	public static void main(String[] args) {
		// Key = SSN
		// Value = Person`s name
		
		Map<Integer, String> people = new HashMap<>();
		
		// HashMaps store data as Key / Value pairs
		
		people.put(1, "ercan");
		people.put(2, "josh");
		people.put(4, "jane");
		people.put(3, "jeff");
		people.put(5, "elon");
		
		System.out.println("Get data using an invalid key: ");
		System.out.println(people.get(11));
		
		System.out.println("Get data using a valid key: ");
		System.out.println(people.get(1));
		
		System.out.println("Get data using a valid key: ");
		System.out.println(people.get(3));
		
		people.remove(5);
		System.out.println("Get data using an invalid key: ");
		System.out.println(people.get(5));
	}

}
