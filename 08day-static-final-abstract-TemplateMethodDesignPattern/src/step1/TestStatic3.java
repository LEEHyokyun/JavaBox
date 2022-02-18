package step1;

class Car{
	int num1;
	static int num2;
	public static void test1() {
		//num1은 접근불가
		//num2은 접근가능
		//num2의 경우 바로 접근할 수도 있고, class.num2로 접근가능
		num2 = 1;
		Car.num2 = 2;
		//test2(); //당연히, non static이므로 불가능
	}
	public void test2() {
		System.out.println(num1); //가능
		System.out.println(num2); //가능
		test1(); //가능
	}
}

public class TestStatic3 {

}
