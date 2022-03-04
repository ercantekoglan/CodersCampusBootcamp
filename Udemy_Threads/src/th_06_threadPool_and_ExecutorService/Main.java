package th_06_threadPool_and_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for(int i =0; i<=5;i++) {
			
			//submit icinde runnable interface i implement eden bir obje olusturmamiz gerekli
			executor.submit(new Worker(String.valueOf(i),i));
			
			//(new Worker(String.valueOf(i),i) yeni bir thread olusturuyoz
			//atamadan sonra task in ne zaman caliscagini executor belirliyo
			//for dongusunde 5 ayri task olusuyo be 5 ayri thread olusuyo
			//kontrolunu executor kendi yapio
			//en fazla 2 thread in ayni anda calismasina izin veriyoruz - yukaridaki 2 ile
			
		}
		
		//baska bir is atamasi yapmayacagim, bu threadlarin isi bitene kadar ben executor u kapatmayacagim demek.
		//taa ki executorun isi bitene kadar.ONEMLI BIR METHOD
		//eger yazmazsak executor main threadi hic bir zaman bitirmeyecek
		executor.shutdown();
		System.out.println("butun isler teslim edildi");
		//belli bir sure sonra executor u durdurmak istiyorsak
		//thread larin calismasi 1 gunu gecerse otomatik olarak sonlanir,
		//erken biterse normal calisma devam eder.
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Butun isler bitti");
		
		//uzun yol
		
		/*Thread t1 = new Thread(new Worker("1", 1));
		Thread t2 = new Thread(new Worker("2", 2));
		Thread t3 = new Thread(new Worker("3", 3));
		Thread t4 = new Thread(new Worker("4", 4));
		Thread t5 = new Thread(new Worker("5", 5));
		System.out.println("Butun isler teslim edildi. ");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t3.start();
		t4.start();
		
		try {
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t5.start();
		
		try {
			t5.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Butun isler tamamlandi. ");*/
	}

}
