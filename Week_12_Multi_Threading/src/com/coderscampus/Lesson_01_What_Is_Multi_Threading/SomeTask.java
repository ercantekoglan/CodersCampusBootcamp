package com.coderscampus.Lesson_01_What_Is_Multi_Threading;

public class SomeTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Hey look at me, I'm a task! "
				+ "I'm running on thread: " + Thread.currentThread().getName());
	}

}
