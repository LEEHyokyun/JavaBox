package step2;
// super() ������ ���� ����ؾ� �ϴ� ���

class Animal{
	int age;
	//�θ�Ŭ�������� �Ű������� �ִ� �����ڸ� ����
	Animal(int age){
		this.age = age;
	}
}

class Person extends Animal{
	Person(int age){
		super(age);
	}
}

public class TestSuper4 {
	public static void main(String[] args) {
		Person p = new Person(22);
		System.out.println(p.age);
	}
}

