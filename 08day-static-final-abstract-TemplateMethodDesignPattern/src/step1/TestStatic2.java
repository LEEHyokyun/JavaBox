package step1;
//static, non static(object/instance member)�� ����
public class TestStatic2 {
	private int age;
	private static int age2;
	public void test1() {
		System.out.println("test1");
		System.out.println(age); //non static���� ���� ����
		System.out.println(age2); //non static���� static ���ٰ���
	}
	public static void test2() {
		System.out.println("test2");
		//System.out.println(age); //���ٺҰ�
		System.out.println(age2); //���ٰ���
		System.out.println(TestStatic2.age2);
	}
	
	public static void main(String[] args) {
		//main method, ������ ��ü�������� �ٷ� �����Ͽ� ��밡���ϴ�.
		//System.out.println(age); //���� Ŭ������ private �����ε� ���� �Ұ�?
		/*
		 * ������ Ŭ������ private instance va�� 
		 * static�� class�ε��� ����, instance�� ���� ��ü������ ����
		 * �ٽ� ����, �޸𸮿� ������� ���� ���¿����� age(instance variable)�� ���� �� Ȱ��Ұ�
		 * �̸� ����ϱ� ���ؼ��� �ݵ�� ��ü������ �ʿ��ϴ�.
		 */
		TestStatic2 t = new TestStatic2();
		System.out.println(t.age);
		//test1 �޼ҵ� ���������� ��ü�����Ŀ� ������ �� �ִ�.
		t.test1();
		//main method ���� static method�ӿ� ����!
		System.out.println(age2);
	}
}
