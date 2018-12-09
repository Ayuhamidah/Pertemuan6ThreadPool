package pertemuan6threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
 class Prosesor implements Runnable {
    private int id;
    public Prosesor(int id){
    this.id = id;    }
    public void run() {
        System.out.println("Memulai Task : Thread"+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        System.out.println("Selesai Task : Thread"+id);    }  }
public class    Aplikasi {
        public static void main(String[] args) {
            ExecutorService service = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 5; i++) {
                for (int j = 1; j <= 100; j=j+2) {
                    //String arg = args[j];
                    System.out.println(j+". ");
                    System.out.println("Bilangan Ganjil");                                    }               
                service.submit(new Prosesor(i));                            }
            service.shutdown();
            System.out.println("Semua task telah disubmit ");
            try {
                service.awaitTermination(1, TimeUnit.DAYS);
            } catch (Exception e) {
                e.printStackTrace();
            } System.out.println("Semua task telah selesai ");        }    }