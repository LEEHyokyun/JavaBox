package step7.test;

import step7.model.Customer;
//import는 다른 패키지의 자원을 사용하기 위함
public class TestAccessModifier {
	public static void main(String[] args) {
		Customer c = new Customer(); //다른 패키지에 있는 클래스를 참조
		System.out.println(c.password1);
	}
}
