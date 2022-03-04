package th_01_thread_building_with_extend;


public class Printer extends Thread{
	
	private String isim;
	
	public Printer(String isim) {
		this.isim = isim;
	}
	@Override
	public void run() {
		System.out.println(isim + " Starting...");
		for(int i =0; i<10; i++) {
			try {
			System.out.println(isim + " Printing");
			
			Thread.sleep(1000);
			}catch(InterruptedException e) {
			System.out.println("Thread broken");
		
			}
		}
		System.out.println(isim + " finished");
	}

}
