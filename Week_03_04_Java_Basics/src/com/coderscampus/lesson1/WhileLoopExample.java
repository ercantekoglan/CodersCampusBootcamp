package com.coderscampus.lesson1;

import java.util.Date;

public class WhileLoopExample {
	void whileLoopExample1 () {
		// this is exactly how a FOR loop works
		// you don't actually ever NEED a FOR loop
		// as you can create one with a WHILE loop
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 1;
		}
		
		System.out.println("Done");
	}
	
	void whileLoopExample2 () {
		
		Date now = new Date();
		@SuppressWarnings("deprecation")
		Date stopNow = new Date(119, 10, 16, 16, 20, 0);
		int i = 0;
		while (now.after(stopNow)) {
			i = i + 1;
			System.out.println(i + ": " + now);
			now = new Date();
		}
		
	}
}