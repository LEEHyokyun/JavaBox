package step11;

public class TestThread10 {
	public static void main(String[] args) {
		SearchServiceWorker sw = new SearchServiceWorker();
		Thread t1 = new Thread(sw, "1�� ���� ���� �˻����� ������");
		Thread t2 = new Thread(sw, "2�� ���� ���� �˻����� ������");
		Thread t3 = new Thread(sw, "3�� ���� ���� �˻����� ������");
		
		t1.start();
		t2.start();
		t3.start();
		
		//heap ������ ������ �ν��Ͻ� ��������
		//������ ���� ��ü�κ��� ������ ��Ƽ ��������� �����Ѵ�.
	}
}
