package th_05_thread_multi_Lock_and_synchronized_problem;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListWorker {

	Random random = new Random();

	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();

	//lock lar istenilen veri tipinden olabilir
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	//list1 1000, list2 1000 deger ekleyerek listlere toplamda 2000 deger ekliyoruz.
	
	
	//lock eklemeden method a synchronized eklersek listlere ekleme tam olur ancak sure 2 katina cikar.

	public void addList1() {
		//buraya gelen thread lock1 ile islem yapicak ve isi bitince lock1 i birakicak, siradaki thread lock1 i alip isleme devam edicek.
		synchronized (lock1) {

			try {
				Thread.sleep(1);

			} catch (InterruptedException ex) {
				Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
			}
			//0-100 arasinda random deger atiyo
			list1.add(random.nextInt(100));
		}

	}

	public void addList2() {

		synchronized (lock2) {
			try {
				Thread.sleep(1);

			} catch (InterruptedException ex) {
				Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
			}
			//0-100 arasinda random deger atiyo
			list2.add(random.nextInt(100));
		}

	}

	public void call() {

		for (int i = 0; i < 1000; i++) {
			addList1();
			addList2();

		}

	}
	
	//list1 vs list 2 ye 2000 deger eklemek istiyoruz.
	// bunu yapmak icin ise call methodunu 2 farkli thread cagirmasi gerek.

	public void calistir() {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				call();

			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				call();

			}
		});
		
		long baslangic = System.currentTimeMillis();

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException ex) {
			Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
		}
		System.out.println("List1 Size :" + list1.size() + " List2 Size: " + list2.size());

		long bitis = System.currentTimeMillis();

		System.out.println("Time Passed : " + (bitis - baslangic));

	}

	
	//synchronized yapmazsan cakismadan dolayi list degerleri eksik cikar
	//lock kullanmazsan sure 2 katina cikar.
	//join threadlarin cakismasini onler.synchronized kullanmazsan yine liste eksik kalir.
	//join ve synchronized e ragmen birden fazla thread var ise liste eksik cikar.cozum icin lock olusturman gerekli.
}