package test;
/*
 * Nested Class 중첩 클래스 (inner class) : class 내부에서 class를 정의
 * Outer class, Inner class 관계는 private member에 접근 가능
 * Inner class는 Outerclass의 객체 생성을 통해서만 객체 생성이 가능하다.
 */
public class TestNestedClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		/*
		 * outer class 객체 생성이 선행되어야
		 * Inner class 객체 생성 및 해당 멤버로의 접근이 가능하다.
		 */
		i.test();
	}
}
