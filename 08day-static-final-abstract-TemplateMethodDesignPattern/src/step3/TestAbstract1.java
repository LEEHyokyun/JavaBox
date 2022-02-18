package step3;
//abstract class
abstract class Person{
	int age = 2;
	Person(){
		System.out.println("Person 객체 생성");
	}
	public void eat() {
		System.out.println("먹다");
	}
}

class Student extends Person{
		
	Student(){
		super(); //Person 생성자를 실행하여 Person객체가 생성됨
		System.out.println("Student 객체 생성");
	}
	
	public void eat() {
		System.out.println("먹어요!");
	}
}

public class TestAbstract1 {
	public static void main(String[] args) {
		//Person p = new Person(); //abstract는 "new"를 통해 객체생성불가
		Student s = new Student();
		//부모타입으로 참조 가능
		s.eat(); 
		s.age = 5;
	}
}

