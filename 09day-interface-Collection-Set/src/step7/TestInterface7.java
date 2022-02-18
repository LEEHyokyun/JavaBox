package step7;

//when using default, static method in interface
//jdk v1.8

interface OpenSourceInterface{
	public void a();
	
	//�θ� ���̴� ���¼ҽ�, �� ǥ�رԾ�
	//���������� �߰������ ���ܳ� ���
	public default void b() {
		System.out.println("new method added");
	}
	public static void c() {
		//static method������ �޼��� ���� �����ϴ�.
		//non static�� ���ǺҰ�
		System.out.println("interface static method");
	}
}

class KbBank implements OpenSourceInterface{
	public void a() {}
}

class KaKaoBank implements OpenSourceInterface{
	public void a() {}
	
	//�ʿ�� ���� �������̵����� ����
	public void b() {
		System.out.println("default method overrided");
	}
}

public class TestInterface7 {
	public static void main(String[] args) {
		OpenSourceInterface os = new KbBank();
		os.b();
		OpenSourceInterface.c();
		//interface static�� �����ϰ� ����
		OpenSourceInterface os2 = new KaKaoBank();
		os2.b();
	}
}
