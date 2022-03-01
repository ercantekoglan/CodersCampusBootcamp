package com.coderscampus.Lesson_03_Understanding_Asynchronous_Programming;

public class Main {

	public static void main(String[] args) {

		String message = "Starting";
		System.out.println(message);

		System.out.println("Thead-" + Thread.currentThread().getName());

		for (int i = 0; i < 50; i++) {
			SomeTask task = new SomeTask();
			new Thread(task).start();
		}

		message = "Done";
		System.out.println(message);
	}

}
