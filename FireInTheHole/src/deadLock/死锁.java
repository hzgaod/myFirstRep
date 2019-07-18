package deadLock;

public class 死锁 {

	private static String s1="left";
	private static String s2="right";
	public static void main(String[] args) {
	Thread t1=	new Thread() {

			@Override
			public void run() {

				while(true) {
					synchronized (s1) {
						System.out.println(Thread.currentThread().getName()+ " get "+s1+" wait "+s2);
						synchronized (s2) {
							System.out.println(Thread.currentThread().getName()+ " get "+s1+" and "+s2+"开吃");
						}
					}
				}
			}
			
		};
		t1.start();
		
		Thread t2=	new Thread() {

			@Override
			public void run() {

				while(true) {
					synchronized (s2) {
						System.out.println(Thread.currentThread().getName()+ " get "+s2+" wait "+s1);
						synchronized (s1) {
							System.out.println(Thread.currentThread().getName()+ " get "+s2+" and "+s1+"开吃");
						}
					}
				}
			}
			
		};
		t2.start();
	}
}
