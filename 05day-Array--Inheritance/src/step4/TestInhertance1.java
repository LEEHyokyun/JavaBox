package step4;

class Animal{
	int age;
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal{
	//Person class�� Animal�� ��ӹ޾� ����� �� �ִ�.
	public void study() {
		System.out.println("�����Ѵ�.");
	}
}

public class TestInhertance1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.study(); //�ڽ� Ŭ������ �θ� Ŭ������ �����Ѵ�.
		p.eat(); //�ڽ��� study �޼ҵ�� �Բ�, �θ��� eat �޼ҵ���� ��� ����!
	}
}
