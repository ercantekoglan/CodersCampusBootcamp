package com.coderscampus.Lesson7_HashCode_and_Equals;

import java.util.HashSet;
import java.util.Set;

public class SetApplication {
	public static void main(String[] args) {
		
		Set<Person> people = new HashSet<>();
		
		people.add(new Person(111, "ercan", "tekoglan"));
		people.add(new Person(111, "ercan", "tekoglan"));
		people.add(new Person(112, "ercan", "tekoglan"));
		
		for (Person person : people) {
			System.out.println(person);
		}
		
		
	}

}
