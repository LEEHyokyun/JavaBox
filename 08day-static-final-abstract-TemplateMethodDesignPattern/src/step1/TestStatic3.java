package step1;

class Car{
	int num1;
	static int num2;
	public static void test1() {
		//num1�� ���ٺҰ�
		//num2�� ���ٰ���
		//num2�� ��� �ٷ� ������ ���� �ְ�, class.num2�� ���ٰ���
		num2 = 1;
		Car.num2 = 2;
		//test2(); //�翬��, non static�̹Ƿ� �Ұ���
	}
	public void test2() {
		System.out.println(num1); //����
		System.out.println(num2); //����
		test1(); //����
	}
}

public class TestStatic3 {

}
