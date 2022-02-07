package step2;
//리모콘 .. 기능을 직접 "실행하는" main method
//기능들은 별도의 class로 정의
public class TestPerson {
	//JVM이 실행 시작지점의 진입점이 main method(starting point!)
	//class를 실제로 메모리에 올려져 객체를 생성할 수 있도록 함
	public static void main(String[] args) {
		System.out.println("main 시작");
		//Person class를 이용하여 Person "객체" 생성
		Person p = new Person();
		//new 연산자, p라는 변수에 참조시킨다(메모리, heap).
		//객체에 저장된 변수의 값(객체>해당 객체의 name참조)
		System.out.println(p.name);
		//객체의 메소드를 호출(객체>해당 객체의 메소드참조)
		p.eat();
		System.out.println("main 종료");
	}
}
