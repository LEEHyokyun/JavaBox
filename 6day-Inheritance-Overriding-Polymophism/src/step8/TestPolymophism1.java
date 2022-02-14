package step8;

class Animal{
	public void sleep() {
		System.out.println("잔다");
	}
	
	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal{
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
}

public class TestPolymophism1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.sleep();
		
		//부모가 자식을 참조한다, 업캐스팅
		//부모타입의 변수로 자식 객체를 참조할 수 있다는 것
		Animal a2 = new Person();
		a2.eat(); //오버라이드 된 자신의(생성된 지금 객체) 메소드
		a2.sleep(); //부모로부터 상속받은 메서드
	}
}
