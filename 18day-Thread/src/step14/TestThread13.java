package step14;

//��Ƽ ������ ȯ�濡���� ����ȭ ó��
public class TestThread13 {
	public static void main(String[] args) {
		Theater theater = new Theater();
		Thread t1 = new Thread(theater);
		Thread t2 = new Thread(theater);
		
		t1.start();
		t2.start();
	}
}
