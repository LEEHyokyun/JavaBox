package step7.test;

import step7.model.Customer;
//import�� �ٸ� ��Ű���� �ڿ��� ����ϱ� ����
public class TestAccessModifier {
	public static void main(String[] args) {
		Customer c = new Customer(); //�ٸ� ��Ű���� �ִ� Ŭ������ ����
		System.out.println(c.password1);
	}
}
