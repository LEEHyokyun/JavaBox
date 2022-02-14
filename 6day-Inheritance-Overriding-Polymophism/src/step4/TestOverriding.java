package step4;

class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}

class rabbit extends Animal{
	//method overriding
	public void eat() {
		System.out.println("채식하다");
		
		//부모의 method까지 호출할 수 있다(suepr이용)
		super.eat();
	}
}

public class TestOverriding {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		
		//overriding된 메소드를 호출한다.
		rabbit r = new rabbit();
		r.eat();
	}
}

// 매개변수가 달라진다면 메소드명이 동일해도, 단순히 메소드명이 동일한 "다른 메소드"를 호출하는 것.
//오버라이딩이 성립하기 위해선 메소드명, 매개변수, return 값 모두 반드시 동일해야 한다.
//접근제어자는 부모 메소드에서 좁아지면 안된다(넓어지는 방향은 가능하다).
	