package step7.model;

public class Customer {
	//public am : 다른 패키지에서도 접근 가능
	public String password1 = "Hello";
	//protected am : 같은 패키지에서만, 상속한 클래스에서만 사용
	protected String password2 = "Hi";
	//default am : 같은 패키지에서만 접근 가능
	String password3 = "HelloHi";
	//private는 동일 클래스 내에서만 접근 가능
	private String password4 = "HH";
	//동일 클래스 내에서 private 변수 사용
	public String getPassword4() {
		return password4;
	}
}
