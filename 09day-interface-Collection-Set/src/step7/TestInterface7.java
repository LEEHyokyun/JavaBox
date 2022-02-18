package step7;

//when using default, static method in interface
//jdk v1.8

interface OpenSourceInterface{
	public void a();
	
	//널리 쓰이는 오픈소스, 즉 표준규약
	//사용법에서의 추가기능이 생겨날 경우
	public default void b() {
		System.out.println("new method added");
	}
	public static void c() {
		//static method까지는 메서드 구현 가능하다.
		//non static은 정의불가
		System.out.println("interface static method");
	}
}

class KbBank implements OpenSourceInterface{
	public void a() {}
}

class KaKaoBank implements OpenSourceInterface{
	public void a() {}
	
	//필요시 물론 오버라이딩까지 가능
	public void b() {
		System.out.println("default method overrided");
	}
}

public class TestInterface7 {
	public static void main(String[] args) {
		OpenSourceInterface os = new KbBank();
		os.b();
		OpenSourceInterface.c();
		//interface static도 동일하게 접근
		OpenSourceInterface os2 = new KaKaoBank();
		os2.b();
	}
}
