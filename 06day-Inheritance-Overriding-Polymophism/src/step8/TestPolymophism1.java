package step8;

class Animal{
	public void sleep() {
		System.out.println("�ܴ�");
	}
	
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal{
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}
}

public class TestPolymophism1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.sleep();
		
		//�θ� �ڽ��� �����Ѵ�, ��ĳ����
		//�θ�Ÿ���� ������ �ڽ� ��ü�� ������ �� �ִٴ� ��
		Animal a2 = new Person();
		a2.eat(); //�������̵� �� �ڽ���(������ ���� ��ü) �޼ҵ�
		a2.sleep(); //�θ�κ��� ��ӹ��� �޼���
	}
}
