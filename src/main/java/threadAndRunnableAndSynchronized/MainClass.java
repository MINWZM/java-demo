package min.threadAndRunnableAndSynchronized;

public class MainClass {
	public static void main(String[] args) {
		//����10���߳�������[ͬһ��]TestForSynchronizedʵ��(����)
		TestForSynchronized temp = new TestForSynchronized();
		for(int index=0;index<100;index++) {
//			MyThread_01 thread = new MyThread_01(temp);
			MyThread_02 thread = new MyThread_02();
			thread.start();
		}
	}
}

class MyThread_01 extends Thread{
	TestForSynchronized testObject;
	public MyThread_01(TestForSynchronized testObject) {
		this.testObject=testObject;
	}
	@Override
	public void run() {
	
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(Thread.currentThread().getName()+"--"+testObject.commonMethod());
		System.out.println(Thread.currentThread().getName()+"--"+testObject.setID_01());
		
		
	}	
}

class MyThread_02 extends Thread{
		
		@Override
		public void run() {
			
			//ÿ���߳̾�����һ��TestForSynchronizedʵ��
			TestForSynchronized temp = new TestForSynchronized();
			System.out.println(Thread.currentThread().getName()+"--"+temp.setID_02());
			
			
		}	
	
}
	
	
