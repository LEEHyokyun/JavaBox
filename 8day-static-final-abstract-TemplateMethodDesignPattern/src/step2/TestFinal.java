package step2;

class Product{
	//final - ���, �빮�ڷ� ����	, �ռ���� _
	private String name = "Hello";
	final String ADMIN_VALUE = "HELLO";
	public void test1() {
		// ADMIN_VALUE = "AA"; //�Ҵ�Ұ�
	}
	
	public final void test2() {
		
	}
}

class MyProduct extends Product{
	//public void test2() {
		//test2 overriding �Ұ�
	//}
}

final class Test{}
//final class�� ��ӺҰ�
//class sub extends Test{}

public class TestFinal {
	
}
