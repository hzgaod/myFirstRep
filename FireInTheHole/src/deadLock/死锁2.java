package deadLock;

import java.nio.charset.MalformedInputException;
import java.util.concurrent.locks.ReentrantLock;
/*
 * 
 */
public class 死锁2 implements Runnable {
	public static ReentrantLock lock1=new ReentrantLock();
	public static ReentrantLock lock2=new ReentrantLock();
	int lock;
	public 死锁2(int lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		try {
			if(lock==1) {
				
				lock1.lockInterruptibly();//如果当前线程未被中断，则获取锁
				Thread.sleep(500);
				lock2.lockInterruptibly();
				System.out.println(Thread.currentThread().getName()+" 执行完毕！");
			}else {
				lock2.lockInterruptibly();
				Thread.sleep(500);
				lock1.lockInterruptibly();
				System.out.println(Thread.currentThread().getName()+" 执行完毕！");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			// 查询当前线程是否保持此锁。
			if(lock1.isHeldByCurrentThread()) {
				lock1.unlock();
			}
			if(lock2.isHeldByCurrentThread()) {
				lock2.unlock();
			}
			System.out.println(Thread.currentThread().getName()+" 退出" );
			
		}
		
	}
    public static void main(String[] args) {
		死锁2  slock1=new 死锁2(1);
		死锁2  slock2=new 死锁2(2);
	    Thread th1=new Thread(slock1, "线程1");
	    Thread th2=new Thread(slock1, "线程2");
	    th1.start();
	    th2.start();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        th2.interrupt(); // 中断线程2
	}
}
