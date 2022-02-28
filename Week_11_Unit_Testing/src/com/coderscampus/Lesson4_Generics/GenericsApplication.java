package com.coderscampus.Lesson4_Generics;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenericsApplication {

	@Test
	public void generics_example() {
		List<String> list = new ArrayList();
		list.add("first string value");
		list.add("second string value");
		list.add("E");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	@Test
	public void more_generics_examples() {
		MyPair<Integer, String> mypair = new MyPair<Integer, String>(1, "one");
		mypair.getKey();
		mypair.getValue();
	}

	@Test
	public void generic_types_at_method_level() {
		// Transformer<Integer,Double> transformer = new Transformer<Integer,Double>();
		// class levelde generic alirsan boyle olur.class level ise not static
		String val = Transformer.join(1, 2.0);
		System.out.println(val);

	}
	
	@Test
	public void wildCard_in_generics() {
		List<Number> list = new ArrayList<>();
		list.add(5); list.add(2.0); list.add(100L);
		String val = Transformer.join(list);
		System.out.println(val);
	}
}
