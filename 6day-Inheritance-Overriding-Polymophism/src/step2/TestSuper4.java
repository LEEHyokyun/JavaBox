package step2;
// super() 구문을 직접 명시해야 하는 경우

class Animal{
	int age;
	//부모클래스에서 매개변수가 있는 생성자를 정의
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

