package step3;

class Animal{
	public void sleep() {
		System.out.println("�ڴ�");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Person extends Animal{
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}
	public void study() {
		System.out.println("����� �����ϴ�");
	}
}

public class TestPolymorphism4 {
	public static void main(String[] args) {
		Animal a = new Person();
		a.sleep();
		a.eat();
		((Person) a).study(); 
		//���� datatype�� �θ�� �Ǿ������Ƿ�,
		//Person ��ü���� �ڽ� �޼ҵ带 ����ϱ� ���� Person���� ������� downcasting �õ�!!
	}
}
