package th_03_thread_building_new_thread_object;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) {
		
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Printing...");
                for (int i = 1 ; i <= 10 ; i++) {
                    try {
                        System.out.println("Printing : " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
        }).start();
       
        
        System.out.println("Main Thread Printing...");
    }
    
}