package th_04_synchronized_Keyword;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadSafe {

	private int count = 0;
	
	//anahtarlar class a ait olur.
	//bir methodu synchronized yazdigimiz zaman, baska hic bir thread o class in icindeki baska hic bir synchronized methoduna giremiyor.
	//girmesi icin lock eklemen lazim.

	// synchronized method a "synchronized" keywordunu eklersek bu method a thread
	// ler teker teker girer ve senkronize bir sekilde calisir...tek bir "lock"
	// oldugu icin thread1 lock a sahipken thread2 bekler, method a giremez.thread1
	// isini bitirdikten sonra thread2 lock alir ve medthod a girebilir
	// arttirma islemini senkronize bir method a tasirsak ayni thread larin ayni
	// anda islem yapmasini,
	// dolayisi ile islemlerin cakismasini onlemis oluruz.
	public synchronized void artir() {

		// count++ thread icerisinde olursa iki thread da ayni anda deger guncellemeye
		// calisabilir.
		count++;
	}

	public void workThread() {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					// count++;
					artir();

				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					// count++;
					artir();
				}
			}
		});

		thread1.start();
		thread2.start();

		try {
			// join methodu thread larin sirayla calismasini saglar.
			// thread1 calisiyo, thread2 calisiyo sonra main thread calisiyo
			// main thread thread1 ve thread2 nin bitmesini bekliyor.
			thread1.join();
			thread2.join();
		} catch (InterruptedException ex) {
			Logger.getLogger(ThreadSafe.class.getName()).log(Level.SEVERE, null, ex);
		}

		// main thread
		System.out.println("Count value : " + count);

	}

	public static void main(String[] args) {
		ThreadSafe threadsafe = new ThreadSafe();

		threadsafe.workThread();

	}

}