import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 线程池使用 {

	public static void main(String[] args) {
		ExecutorService pool=Executors.newFixedThreadPool(1);
		//放入线程
		pool.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(new Date());
				
			}
		});
		pool.shutdown();
	}
}
