package com.coderscampus.Lesson_07_CompletableFutures;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MultiThreadingApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		String message = "Starting";
		System.out.println(message);
		System.out.println("Thead-" + Thread.currentThread().getName());

		// This starts up as many threads as there are iterations in the for loop.
		// You only want to fire up a ton of threads, if those threads are going to
		// be waiting a lot... i.e. sending requests across the internet.
//		for (int i=0; i<50; i++) {
//			SomeTask task = new SomeTask();
//			new Thread(task).start();
//		}

		// For a CPU bound operation like we have in our "SomeTask" class,
		// we should make use of an ExecutorService


//		ExecutorService service = Executors.newSingleThreadExecutor();

		
			for (int i = 0; i < 5; i++) {
				CompletableFuture.supplyAsync(() -> new SomeTask())
								 .thenApply(someTask -> someTask.call())
								 .thenAccept(dto -> System.out.println(dto));

				// Futures were great prior to Java 8, but now we have something
				// better
//			Future<TaskDto> futureTask = service.submit(new SomeTask());
//			System.out.println(futureTask.get());
			}

			message = "Done";
			System.out.println(message);
		}

	}
