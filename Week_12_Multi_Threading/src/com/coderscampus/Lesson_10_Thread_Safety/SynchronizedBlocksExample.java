package com.coderscampus.Lesson_10_Thread_Safety;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class SynchronizedBlocksExample {

	private AtomicInteger j = new AtomicInteger(0);
	//private Integer j -0; Integer is not thread satefy. But AtomicInteger is.
	
	@Test
	public void example () {

		List<CompletableFuture<Integer>> tasks = new ArrayList<>();

		
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i=0; i<10000; i++) {
			CompletableFuture<Integer> task = 
					CompletableFuture.supplyAsync(() -> incrementJ(), pool);
			tasks.add(task);
		}

		while (tasks.stream().filter(CompletableFuture::isDone).count() < 10000) {
			System.out.println("Number of completed threads: " 
		               + tasks.stream().filter(CompletableFuture::isDone).count());
		}

		System.out.println("Number of completed threads: " 
	               + tasks.stream().filter(CompletableFuture::isDone).count());

		outputJ();
	}
	private void outputJ() {
		System.out.println(j);
	}
	private Integer incrementJ() {
		try { Thread.sleep(500); } catch (InterruptedException e) {}

		synchronized (j) {
			j.set(j.get() + 1);
			return j.get();
		}
	}

}