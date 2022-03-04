package th_08_wait_and_notify_methods;

import java.util.Scanner;

public class WaitNotify {

	// synchronized (this) yaparsak baska methodlarda lock varsa blocklanir. lock
	// olusturup istedigimiz methodlara atarsak diger method larin blocklanmasini
	// engelleriz.
	private Object lock = new Object();

	public void thread1Fonksiyonu() {

		synchronized (lock) {
			System.out.println("Thread 1 calisiyor");
			System.out.println("Thread 1 Thread2'nin kendisini uyandirmasini bekliyor...");

			try {
				// anahtari teslim etmek istedigimizi soyluyor. alt satirlar calismiyor.
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Thread 1 Uyandi. Devam ediyor...");

		}

	}

	public void thread2Fonksiyonu() {

		Scanner scanner = new Scanner(System.in);

		try {
			// thread 1 lock u alsin diye 2 sn bekletiyoz.thread 2 sn sonra uyaniyor
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (lock) {
			System.out.println("Thread 2 calisiyor");
			System.out.println("Devam etmek icin bir tusa basiniz");

			scanner.nextLine();

			// wait ile bekleyen thread i uyandirmak icin
			// thread 2 in isi bitti 1 devam edicek
			lock.notify();

			System.out.println("Uyandirdim abi. Ben gidiyorum ama 2 sn bekle..");

			try {
				//
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
