package step1;

public class Bird implements Flyer{
	@Override //annotation!
	public void fly() {
		//���� �������̽��� abstract method�� ����
		System.out.println("Bird is flying");
	}
}
