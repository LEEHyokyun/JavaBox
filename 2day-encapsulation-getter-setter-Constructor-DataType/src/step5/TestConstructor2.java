package step5;

public class TestConstructor2 {
	public static void main(String[] args) {
		CreditCard c = new CreditCard();
		c.setPersonalInfo("나의 개인정보");
		System.out.println(c.getPersonalInfo());
		System.out.println("******************");
		

		//생성자가 명시된 경우
		//생성자 인자를 전달해야 해당 객체를 생성할 수 있다.
		CreditCard2 c2 = new CreditCard2("나의 개인정보2");
		System.out.println(c2.getPersonalInfo());
		c2.setPersonalInfo("너의 개인정보");
		System.out.println(c2.getPersonalInfo());
	}
}
