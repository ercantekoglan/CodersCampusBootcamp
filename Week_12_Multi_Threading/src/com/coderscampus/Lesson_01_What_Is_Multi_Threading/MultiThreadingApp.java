package com.coderscampus.Lesson_01_What_Is_Multi_Threading;

public class MultiThreadingApp {
	
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			SomeTask task = new SomeTask();
			new Thread(task).start();
		}
	}

}