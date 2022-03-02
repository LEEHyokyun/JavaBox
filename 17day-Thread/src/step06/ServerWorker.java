package step06;
/*
 * ���� Ŭ������ ���� �ټ��� �����尡 ������ ���
 * �����췯�� ���� run() �޼ҵ尡 ������ ȣ�������
 * �����庰�� stack �޸𸮿� �����Ǿ�, �� stack �޸� �������� ������ ���� �� ����ȴ�.
 * �̷��⶧���� ���� ������ �����庰�� 0,0,0 �ݺ�����(i)(=��������)�� �����Ǹ� ���ÿ� �����Ǿ� ����ȴ�.
 */
public class ServerWorker implements Runnable{
	@Override
	//start()�� JVM�� �ش� �����带 �����층 �� run ȣ��
	//�� �� ������ �������� ���� ����
	public void run() {
		try {
			chatting();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void chatting() throws InterruptedException {
		/*
		 * thread�� name�� ��ȯ���� �� �ִ�.
		 */
		String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+ " ServerWorker is running: "+i);
			Thread.sleep(200);
		}
	}
}
