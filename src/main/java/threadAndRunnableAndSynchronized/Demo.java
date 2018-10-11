package min.threadAndRunnableAndSynchronized;

public class Demo {
	public static void main(String[] args) {
		Thread thread1 = new Thread1();
		Runnable runnable1 = new Runnable1();
		Thread thread2 = new Thread(runnable1);
		thread1.start();
		thread2.start();
		runnable1.run();
	}
}
