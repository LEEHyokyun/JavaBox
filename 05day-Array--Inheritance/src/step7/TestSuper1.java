package step7;
// super.member

class Parent{
	String name = "Parent name";
}

class Child extends Parent{
	String name = "Child name";
	public void printInfo() {
		System.out.println(name);
		System.out.println(super.name); 
		//�ڽ� Ŭ�������� �θ�ü�� (default/public) �ν��Ͻ� ������ ����
	}
}

public class TestSuper1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.printInfo(); //�ڽİ�ü�� name
		
	}
}
