package step6;

public class TestMethod2 {
	public static void main(String[] args) {
		//Friend ��ü ����
		Friend f = new Friend();
		//�޼��� ȣ��
		f.eat();
		//���ڸ� ����
		f.eat2("����");
		f.eat3("���", 3);
		
		String returnValue = f.eat4();
		System.out.println(returnValue);
	}
}
