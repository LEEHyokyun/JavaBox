package step03;
/*
 * thread by implements
 */
class Worker implements Runnable{
	@Override
	public void run() {
		/*
		 * thread ���೻�� ����, run ���� ����� ������ ����
		 * Start() �޼ҵ�� Runnable ���°� �ȴٸ�, �����췯(JVM)�� ���� ȣ��
		 */
		for(int i=0;i<10;i++) {
			System.out.println("Worker in process "+i);
		}
	}
}
public class TestThread3 {
	public static void main(String[] args) {
		/*
		 * Worker ��ü�� ������
		 * thread ��ü�� ����
		 */
		Worker worker = new Worker();
		Thread thread = new Thread(worker);
		//Thread thread = new Thread(new Wokrer());
		/*
		 * Thread ��ü�� �����ڷ� ����
		 */
		thread.start();
		
		System.out.println("***main thread ����Ǿ����ϴ�.");
	}
}
