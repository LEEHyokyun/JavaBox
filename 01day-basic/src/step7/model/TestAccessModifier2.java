package step7.model;

public class TestAccessModifier2 {
	public static void main(String[] args) {
		Customer c = new Customer();
		//���� ��Ű�� �������� public, protected, default ���� ����
		System.out.println(c.password1);
		System.out.println(c.password2);
		System.out.println(c.password3);
	}
}
