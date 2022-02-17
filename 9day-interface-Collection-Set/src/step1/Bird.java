package step1;

public class Bird implements Flyer{
	@Override //annotation!
	public void fly() {
		//상위 인터페이스의 abstract method를 구현
		System.out.println("Bird is flying");
	}
}
