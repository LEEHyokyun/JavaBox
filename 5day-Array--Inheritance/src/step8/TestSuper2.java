package step8;
//first super object created, after sub object created.
//after all, reference variable refers it.

//java.lang not needed to be called.

class Parent{
	public Parent() {
		System.out.println("Parent 객체 생성");
	}
}

class Child extends Parent{
	public Child(){
		super(); //super은 반드시 자식 객체의 first statement
		//extends시 기본적으로 부모생성자 호출인 super() 키워드가 호출된다.
		//super() //부모생성자 명기하지 않아도 기본적으로 실행되는 키워드
		System.out.println("Child 객체 생성");
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}
