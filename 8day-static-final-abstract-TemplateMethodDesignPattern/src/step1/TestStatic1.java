package step1;

class Person{
	int money1; //instance variable, heap�� ����
	static int money2; //static variable, metaspace�� ����
	
	public void test1() { //instance
		System.out.println("test1");
	}
	
	public static void test2() { //static 
		System.out.println("test2");
	}
}

public class TestStatic1 {
	public static void main(String[] args) {
		//�Ϲ� �ν��Ͻ� variable ���ٽ� ��ü����
		Person p = new Person();
		System.out.println(p.money1);
		//static ���ٽ� ��ü�����ʿ�X
		System.out.println(Person.money2);
		//method
		p.test1();
		Person.test2();
	}
}
