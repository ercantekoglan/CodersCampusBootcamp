package com.coderscampus.Lesson_05_CachedThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.coderscampus.Lesson_04_Leveraging_Executors.SomeTask;

public class MultiThreadingApp {
	
	public static void main(String[] args) {
		String message = "Starting";
		System.out.println(message);
		System.out.println("Thead-"+ Thread.currentThread().getName());
		
		// This starts up as many threads as there are iterations in the for loop.
		// You only want to fire up a ton of threads, if those threads are going to
		// be waiting a lot... i.e. sending requests across the internet.
//		for (int i=0; i<50; i++) {
//			SomeTask task = new SomeTask();
//			new Thread(task).start();
//		}
		
		// For a CPU bound operation like we have in our "SomeTask" class,
		//  we should make use of an ExecutorService

		//you dont say how many thread will work. (max sayida thread calistirir).bi thread 6 sn bosta kalirsa otomatikmen kendini kapatir.
		//cpu bound task ile calisiyosan kullanma. cpu yu max calistirir.
		//calisritmadan once test et.kodu senkronize kodla ve beak eger uzun suruyosa thread ile dene
		ExecutorService service = Executors.newCachedThreadPool();

		for (int i=0; i<50; i++) {
			service.execute(new SomeTask());
		}
		
		message = "Done";
		System.out.println(message);
	}
	
	
}
