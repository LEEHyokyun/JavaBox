package step5;

public class Person extends Animal{
	//super class(Animal) is generalized over Person
	public void study() {
		System.out.println("공부하다");
		//기본적으로 상속받더라도
		//직접적으로 부모 인스턴스 멤버에 접근 불가
		//부모의 private 변수, 메서드에 접근 불가
		System.out.println(getAge());
		//다만 위와 같이 부모 class에서 선언된 age getter
		//즉, 메소드 자체는 바로 사용이 가능하다(*별도의 부모객체 생성필요없이)
		//private 인스턴스 멤버에 대해서만 직접 접근 불가
	}
}
