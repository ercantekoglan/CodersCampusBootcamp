package th_10_ReentrantLock_ve_Condition_sinifi;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReentrantLockOrnegi {

	private int say = 0;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void artir() {
		for (int i = 0; i < 10000; i++) {

			say++;
		}

	}

	public void thread1Fonksiyonu() {

		lock.lock();
		System.out.println("Thread 1 calisiyor...");
		System.out.println("Thread 1 Uyandirilmayi Bekliyor....");

		try {
			condition.await();
		} catch (InterruptedException ex) {
			Logger.getLogger(ReentrantLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("Thread 1 uyandirildi ve Islemine Devam Ediyor....");
		artir();

		lock.unlock();

	}

	public void thread2Fonksiyonu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Logger.getLogger(ReentrantLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
		}
		Scanner scanner = new Scanner(System.in);

		lock.lock();
		System.out.println("Thread 2 calisiyor....");

		artir();
		System.out.println("Devam etmek icin bir tusa basin...");
		scanner.nextLine();
		condition.signal();
		System.out.println("Thread 1'i Uyandirdim.Ben gidiyorum...");

		lock.unlock();

	}

	public void threadOver() {
		System.out.println("Say degiskenin degeri : " + say);

	}
}
