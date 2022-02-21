package com.coderscampus.Lesson8_RegEx_2;

public class RegExApplication2 {

 public static void main(String[] args) {
	// valid email address: trevor-page.2@gmail.com
	// valid email address: Trevor@CraftyCodr.com

	String input = "fake.email@gmail.com";
	boolean matchFound = input.matches("[a-z]+.?[a-z]+@[a-z]+.[a-z]{1,5}");

	System.out.println(matchFound);
	// valid
	inputMatchesRegExPattern("fake.email@gmail.com");
	// invalid (missing an @ symbol)
	inputMatchesRegExPattern("trevorcraftycodr.com");
	// invalid (domain extension is too long)
	inputMatchesRegExPattern("trevor@craftycodr.thisisntarealdomain");
	// valid
	inputMatchesRegExPattern("trevor@craftycodr.com");
	// valid
	inputMatchesRegExPattern("trevor-page.2@gmail.com");
	// valid
	inputMatchesRegExPattern("Trevor@CraftyCodr.com");
}

private static void inputMatchesRegExPattern(String input) {
	boolean matchFound = input.matches("^[a-zA-Z0-9][a-zA-Z0-9-]{0,}\\.?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{1,5}$");
	System.out.println("For Input " + input + ", match found = " + matchFound);
}

}
