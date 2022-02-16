package step2;

class Product{
	//final - 상수, 대문자로 구성	, 합성어는 _
	private String name = "Hello";
	final String ADMIN_VALUE = "HELLO";
	public void test1() {
		// ADMIN_VALUE = "AA"; //할당불가
	}
	
	public final void test2() {
		
	}
}

class MyProduct extends Product{
	//public void test2() {
		//test2 overriding 불가
	//}
}

final class Test{}
//final class는 상속불가
//class sub extends Test{}

public class TestFinal {
	
}
