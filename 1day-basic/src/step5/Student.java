package step5;

public class Student {
	//Worker method
	public void study() {
		System.out.println("�л��� �����ϴ�");
	}
	
	public void study2(String subject) {
		System.out.println(subject + " �����ϴ�");
	}
	
	//Worker method(return type�� �����ϴ� ���)
	public String study3(String subject) {
		String info = subject + " �����ϴ�.";
		return info;
	}
}
