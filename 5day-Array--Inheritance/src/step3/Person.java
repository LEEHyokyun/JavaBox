package step3;

public class Person {
	public void eat() {
		System.out.println("�Դ�");
	}

	public void eat(String menu) {
		System.out.println(menu + "��(��) �Դ�");
	}

	public void eat(String menu, int count) {
		System.out.println(menu + "��(��) " + count + "�κ� �Դ�");
	}

	public void eat(int count, String menu) {
		System.out.println(menu + "��(��) " + count + "�κ� �Դ�");
	}

	// ����Ű ����!
	// ctrl + shift + / : �ּ�
	// ctrl + shift + \ : �ּ�����
	// ctrl + shift + f : �ڵ�����(indent ��)
	// ctrl + shift + o : import
}
