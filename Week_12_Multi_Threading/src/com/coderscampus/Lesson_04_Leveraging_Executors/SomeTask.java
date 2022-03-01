package com.coderscampus.Lesson_04_Leveraging_Executors;

import java.util.Random;

public class SomeTask implements Runnable {

	private static int taskId = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10000000; i++) {
			Integer int1 = new Random().nextInt();
			Integer int2 = new Random().nextInt();
			Double something = (int1 + int2) * 1.5;
		}
		taskId++;
		System.out.println("Hey look at me, I'm task-id: " + taskId + "! " + "I'm running on thread: "
				+ Thread.currentThread().getName());
	}

}