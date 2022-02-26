package com.coderscampus.Lesson8_Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda_App {
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Trevor Page");
		names.add("John Doe");
		names.add("Jane Doe");
		names.add("Elon Musk");
		names.add("Josh Someone");

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		// example 1 of creating a lamba expression
		Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

		// example 2, slightly more "verbose"
		Collections.sort(names, (String o1, String o2) -> o2.compareTo(o1));

		// example 3, even more "verbose", note: not the same functionality as above
		// because we're doing some null checks
		Collections.sort(names, (String o1, String o2) -> {
			if (o2 != null && o1 != null) {
				return o2.compareTo(o1);
			} else {
				return 0;
			}
		});

		/*  parameter -> expression
		 * 
		 * (parameter1, parameter2) -> expression
		 * 
		 * Expressions are limited. They have to immediately return a value, 
		 * and they cannot contain variables, assignments or statements such as if or for. 
		 * In order to do more complex operations, a code block can be used with curly braces. 
		 * If the lambda expression needs to return a value, then the code block should have a return statement.
		 * 
		 *  (parameter1, parameter2) -> { code block }
		 *  
		 *  
		 *  ArrayList<Integer> numbers = new ArrayList<Integer>();
    		numbers.add(5);
    		numbers.add(9);
    		numbers.add(8);
    		numbers.add(1);
    		numbers.forEach( (n) -> { System.out.println(n); } );
    		
    		
    		
    		===>>>Lambda expressions can be stored in variables if the variable's type is an interface which has only one method. 
    		The lambda expression should have the same number of parameters and the same return type as that method. 
    		Java has many of these kinds of interfaces built in, 
    		such as the Consumer interface (found in the java.util package) used by lists.
    		
    		
    		Use Java's Consumer interface to store a lambda expression in a variable:

    		import java.util.function.Consumer;
    			
    		  ArrayList<Integer> numbers = new ArrayList<Integer>();
    			numbers.add(5);
    			numbers.add(9);
    			numbers.add(8);
    			numbers.add(1);
    			Consumer<Integer> method = (n) -> { System.out.println(n); };
    			numbers.forEach( method );
		 * 
		 * */
	}
}
