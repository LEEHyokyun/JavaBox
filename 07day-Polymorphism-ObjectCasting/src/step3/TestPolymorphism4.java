package step3;

class Animal{
	public void sleep() {
		System.out.println("자다");
	}
	public void eat() {
		System.out.println("먹다");
	}
}

class Person extends Animal{
	public void eat() {
		System.out.println("사람이 수저로 먹다");
	}
	public void study() {
		System.out.println("사람이 공부하다");
	}
}

public class TestPolymorphism4 {
	public static void main(String[] args) {
		Animal a = new Person();
		a.sleep();
		a.eat();
		((Person) a).study(); 
		//현재 datatype이 부모로 되어있으므로,
		//Person 자체적인 자식 메소드를 사용하기 위해 Person까지 끌어내리는 downcasting 시도!!
	}
}
