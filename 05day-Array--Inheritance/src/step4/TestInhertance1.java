package step4;

class Animal{
	int age;
	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal{
	//Person class는 Animal을 상속받아 사용할 수 있다.
	public void study() {
		System.out.println("공부한다.");
	}
}

public class TestInhertance1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.study(); //자식 클래스는 부모 클래스를 포함한다.
		p.eat(); //자식의 study 메소드와 함께, 부모의 eat 메소드까지 사용 가능!
	}
}
