package com.coderscampus.Lesson6_SortingWith_Comparator;

import java.util.Comparator;

public class PersonHeightComparator implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		return person1.getHeight().compareTo(person2.getHeight());
	}

}