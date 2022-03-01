package com.coderscampus.Lesson_07_CompletableFutures;

import java.util.Random;
import java.util.concurrent.Callable;

import com.coderscampus.Lesson_06_Future.TaskDto;

public class SomeTask implements Callable<TaskDto> {
	private static int taskId = 0;

	@Override
	public TaskDto call() {
		TaskDto taskDto = new TaskDto();
		for (int i = 0; i < 10000000; i++) {
			Integer int1 = new Random().nextInt();
			Integer int2 = new Random().nextInt();
			Double something = (int1 + int2) * 1.5;
			taskDto.setValue(something);
		}
		taskId++;
		System.out.println("Hey look at me, I'm task-id: " + taskId + "! " + "I'm running on thread: "
				+ Thread.currentThread().getName());
		taskDto.setFinished(true);
		return taskDto;
	}

}