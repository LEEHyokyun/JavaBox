package step02;
/*
 * multi thread
 * main thread, Worker thread
 */
class Worker extends Thread{
	@Override
	public void run() {
		/*
		 * Worker thread�� ���೻���� �����ϴ� �޼ҵ�*�������̵�
		 * jvm�� ���� �����尡 �����층�Ǹ� ȣ��Ǵ� �޼ҵ��̴�.
		 * ��, running thread ���°� �ȴٸ� run �޼ҵ带 ȣ���Ͽ� �ش� ������ �����Ѵ�.
		 * �� run �޼ҵ� ������ ����Ǿ�����, �ش� �����尡 ����ȴ�.
		 */
		for(int i=0;i<10;i++) {
			System.out.println("Worker thread in process "+i);
		}
	};
}

public class TestThread2 {
	public static void main(String[] args) {
		Worker thread = new Worker();
		/*
		 * main thread�� ������ �����Ѵ�.
		 * �� ��Ƽ������� �����Ͽ�, main thread ���� �Ϸ� �� running state.
		 */
		thread.start();
		/*
		 * thread�� ���డ�� ����, �� JVM�� �����带 �����층�ϵ���
		 * �ش� �����带 ��Ƽ������� ����� �� �ֵ��� running ���·� ��ȯ��Ų��.
		 */	
		System.out.println("****mian thread�� ����Ǿ����ϴ�.****");
	}
	
}
