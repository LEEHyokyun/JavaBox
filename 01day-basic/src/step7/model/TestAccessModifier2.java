package step7.model;

public class TestAccessModifier2 {
	public static void main(String[] args) {
		Customer c = new Customer();
		//동일 패키지 내에서는 public, protected, default 접근 가능
		System.out.println(c.password1);
		System.out.println(c.password2);
		System.out.println(c.password3);
	}
}
