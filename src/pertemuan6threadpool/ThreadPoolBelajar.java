package pertemuan6threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class ThreadPoolBelajar {
 public static void main(String[] args) {
	        ThreadPool pool = new ThreadPool(7);	 
	        for (int i = 0; i < 5; i++) {
	            Task task = new Task(i);
	            pool.execute(task);
	        }
	}    
}
