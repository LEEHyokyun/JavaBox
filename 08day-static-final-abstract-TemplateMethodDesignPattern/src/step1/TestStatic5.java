package step1;

class Customer{
	static String name;
	Customer(String name){
		Customer.name = name;
	}
}

public class TestStatic5 {
	public static void main(String[] args) {
		Customer c1 = new Customer("아이유");
		System.out.println(c1.name);
		Customer c2 = new Customer("박보검");
		System.out.println(c2.name);
		System.out.println(c1.name);
		//애초에 올바른 접근이 아님
		System.out.println(Customer.name);
	}
}
