package step4;

abstract class Parent{
	public void eat() {
		System.out.println("밥먹다");
	}
	//abstract method - abstract class!
	public abstract void study();
}

//구현하거나 Child도 abstract로 선언되거나
//abstract -> implement
class Child extends Parent{
	public void study() {
		System.out.println("hello study");
	}
}

abstract class Child2 extends Parent{
	//Child2도 abstract class화하여 implement하지 않아도 될 경우
}

public class TestAbstract2 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.study();
	}
}
