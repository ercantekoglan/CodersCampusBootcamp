package com.coderscampus.lesson1;

public class ForLoopExample {
	
	void forLoopExample () {
		// init; termination condition; increment
		for (int i = 0; i <= 100; i = i + 1) {
			System.out.print(i + ": ");
			System.out.println(i*i);
		}
		
		System.out.println("Done");
	}
	
	void incrementExample1 () {
		System.out.println("Incrementing example");
		for (int j=0; j<10; j++) {
			System.out.println(j);
		}
		
		System.out.println("Decrementing example");
		for (int j=9; j>=0; j--) {
			System.out.println(j);
		}
		
	}
	
	void incrementExample2 (int j) {
		System.out.println("Inside incrementExample2 method j = " + j);
	}
}