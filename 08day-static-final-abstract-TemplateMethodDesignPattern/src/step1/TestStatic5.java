package step1;

class Customer{
	static String name;
	Customer(String name){
		Customer.name = name;
	}
}

public class TestStatic5 {
	public static void main(String[] args) {
		Customer c1 = new Customer("������");
		System.out.println(c1.name);
		Customer c2 = new Customer("�ں���");
		System.out.println(c2.name);
		System.out.println(c1.name);
		//���ʿ� �ùٸ� ������ �ƴ�
		System.out.println(Customer.name);
	}
}
