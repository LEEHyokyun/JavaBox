package step1;

public class TestStatic7 {
	public static void main(String[] args) {
		System.out.println("main method ����");
	}
	
	//static �ʱ�ȭ ����
	//static �ʱ�ȭ ������ main method ���ο��� �켱������ ����Ǵ� ����
	static {
		System.out.println("static �ʱ�ȭ ����");
	}
}