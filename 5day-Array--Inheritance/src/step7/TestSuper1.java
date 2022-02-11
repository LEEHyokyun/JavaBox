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
		//자식 클래스에서 부모객체의 (default/public) 인스턴스 변수에 접근
	}
}

public class TestSuper1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.printInfo(); //자식객체의 name
		
	}
}
