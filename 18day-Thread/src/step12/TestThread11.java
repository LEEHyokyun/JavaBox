package step12;

public class TestThread11 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		
		Thread t1 = new Thread(toilet, "�ں���");
		Thread t2 = new Thread(toilet, "���ϴ�");
		t1.start();
		t2.start();
		/*
		 * ��Ƽ ������ ȯ�濡�� �ܼ��� if ���� ���ǹ����� �����ϱ�� �����!
		 */
	}
}
