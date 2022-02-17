package step1;

public class TestInterface1 {
	public static void main(String[] args) {
		System.out.println(Flyer.ID);
		//ID는 상수이므로 재할당불가, 사용하기만 해야함
		Flyer f1 = new Bird();
		//Datatype - interface, Object - 자식객체
		f1.fly(); 
		//자식객체가 오버라이드한 메소드 호출, 즉 구체화한 메소드를 호출!
		Flyer f2 = new AirPlane();
		f2.fly();
		//동일한 방법으로 객체를 생성
	}
}
