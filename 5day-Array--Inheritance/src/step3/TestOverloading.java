package step3;

public class TestOverloading {
	public static void main(String[] args) {
		//Method overloading
		//������ �޼ҵ� ������ �پ��� �Ű������� �����Ͽ� ���
		Person p = new Person();
		p.eat();
		p.eat("������");
		//�Ű����� ������ �޶����ٸ� �޼ҵ� �����ε� ����
		//�� �������� �������X
		p.eat("������", 3);
		p.eat(3, "������");
	}
}
