package step1;
//static, non static(object/instance member)의 접근
public class TestStatic2 {
	private int age;
	private static int age2;
	public void test1() {
		System.out.println("test1");
		System.out.println(age); //non static끼리 접근 가능
		System.out.println(age2); //non static에서 static 접근가능
	}
	public static void test2() {
		System.out.println("test2");
		//System.out.println(age); //접근불가
		System.out.println(age2); //접근가능
		System.out.println(TestStatic2.age2);
	}
	
	public static void main(String[] args) {
		//main method, 별도의 객체생성없이 바로 접근하여 사용가능하다.
		//System.out.println(age); //같은 클래스의 private 변수인데 접근 불가?
		/*
		 * 동일한 클래스라도 private instance va는 
		 * static은 class로딩시 생성, instance는 최종 객체생성시 생성
		 * 다시 말해, 메모리에 적재되지 않은 상태에서의 age(instance variable)은 접근 및 활용불가
		 * 이를 사용하기 위해서는 반드시 객체생성이 필요하다.
		 */
		TestStatic2 t = new TestStatic2();
		System.out.println(t.age);
		//test1 메소드 마찬가지로 객체생성후에 접근할 수 있다.
		t.test1();
		//main method 역시 static method임에 유의!
		System.out.println(age2);
	}
}
