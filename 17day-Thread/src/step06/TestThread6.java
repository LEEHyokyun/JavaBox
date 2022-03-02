package step06;
/*
 * Runnable ���� Ŭ�������� �ټ��� �����带 ����
 */
public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("**main thread�� ����Ǿ����ϴ�.**");
		ServerWorker worker = new ServerWorker();
		Thread thread1 = new Thread(worker, "A");
		//�� thread�� �̸� �Ҵ簡��
		thread1.start();
		Thread thread2 = new Thread(worker, "B");
		//�� thread�� �̸� �Ҵ簡��
		thread2.start();
		/*
		 * Runnable ���� Ŭ�������� �ټ��� �����带 �����ϴ� ���
		 * ��, ������ ���� Ŭ���� �󿡼� ���� Thread ��ü�� �����Ͽ�
		 * ���� thread, �ټ��� �����带 �����ϴ� ���
		 */
		/*
		 * �ټ��� Ŭ���̾�Ʈ�� �� ������ ������ ��� :
		 * �ټ��� Ŭ���̾�Ʈ���� �� ���� ���񽺸� ���ÿ� ó���ؾ��ϴ� ����̴�.
		 * �� ������ ���񽺸�, �������� ������� ����� ���� ������ �󿡼� ���������� ó���ϴ� ���
		 * * �� �����尡 �����ȴٸ� �������� stack �޸𸮸� �Ҵ��ϰ� ������ ���⿡ ����ȴ�.
		 */
		System.out.println("**main thread�� ����Ǿ����ϴ�.**");
	}
}
