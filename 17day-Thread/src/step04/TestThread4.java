package step04;

public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("main thread ����Ǿ����ϴ�.");
		VideoWorker worker1 = new VideoWorker();
		Thread thread1 = new Thread(worker1);
		thread1.start();
		AudioWorker worker2 = new AudioWorker();
		Thread thread2 = new Thread(worker2);
		thread2.start();
		/*
		 * ��½� ���׹��� ���, �� ������ ��������� ��Ƽ�� ���������� ����
		 * ����� ���忡���� ���ÿ� ����Ǵ� ��ó�� ���δ�.
		 */
		System.out.println("main thread ����Ǿ����ϴ�.");
		/*
		 * Thread.sleep�� Ȱ���� ��� �����층�� �̸�����...���� ������ ���� ��������
		 */
	}
}
