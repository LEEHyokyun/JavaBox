package step1;

class Person{
	int money1; //instance variable, heap에 저장
	static int money2; //static variable, metaspace에 저장
	
	public void test1() { //instance
		System.out.println("test1");
	}
	
	public static void test2() { //static 
		System.out.println("test2");
	}
}

public class TestStatic1 {
	public static void main(String[] args) {
		//일반 인스턴스 variable 접근시 객체생성
		Person p = new Person();
		System.out.println(p.money1);
		//static 접근시 객체생성필요X
		System.out.println(Person.money2);
		//method
		p.test1();
		Person.test2();
	}
}
