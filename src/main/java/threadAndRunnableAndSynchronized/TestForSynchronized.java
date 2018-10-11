package min.threadAndRunnableAndSynchronized;

public class TestForSynchronized {
	static int ID=0;
	//���Է���01-synchronize��()����
	public String setID_01()
	{
		synchronized(this)
		{
			ID++;
			return "setID_01() ID No.:"+ID;
		}
	}
	//���Է���02-sychronized��(�༶��)
	public String setID_02() {
		synchronized (TestForSynchronized.class) {
			ID++;
			return "setID_02 ID No.:"+ID;
			
		}
	}
	//���Է���03-synchronized����
	public synchronized String setID_03() {
		ID++;
		return "setID_03 ID No.:"+ID;
	}
	//��ͨ����
	public String commonMethod() {
		ID++;
		return "commonMethod ID No.:"+ID;
	}
}
