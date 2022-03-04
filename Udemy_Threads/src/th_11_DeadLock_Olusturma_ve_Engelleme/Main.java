package th_11_DeadLock_Olusturma_ve_Engelleme;

//DeadLock ta bir cok thread birbirini bekliyor ve hic bir yere ilerleyemiyor.
//yani bir cok thread belli bir lock u aliyor ancak diger locklar kapildigi icin de deadlock olayi olusuyor
//ve alttaki islemleri hic ir zaman gerceklestiremiyoruz.
//yani bir cok thread birbirini bekliyor.
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
          DeadlockOrnegi deadlock  = new DeadlockOrnegi();
    
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            deadlock.thread1Fonksiyonu();
        }
    });
     Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            deadlock.thread2Fonksiyonu();
        }
    });
    thread1.start();
    
    thread2.start();
    
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    deadlock.threadOver();
    }
    
  

}

