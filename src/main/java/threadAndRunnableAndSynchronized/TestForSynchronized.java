package min.threadAndRunnableAndSynchronized;

public class TestForSynchronized {
	static int ID=0;
	//测试方法01-synchronize块()对象级
	public String setID_01()
	{
		synchronized(this)
		{
			ID++;
			return "setID_01() ID No.:"+ID;
		}
	}
	//测试方法02-sychronized块(类级别)
	public String setID_02() {
		synchronized (TestForSynchronized.class) {
			ID++;
			return "setID_02 ID No.:"+ID;
			
		}
	}
	//测试方法03-synchronized方法
	public synchronized String setID_03() {
		ID++;
		return "setID_03 ID No.:"+ID;
	}
	//普通方法
	public String commonMethod() {
		ID++;
		return "commonMethod ID No.:"+ID;
	}
}
