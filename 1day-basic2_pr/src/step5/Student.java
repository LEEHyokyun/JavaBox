package step5;

public class Student {
	//Worker method
	public void study() {
		System.out.println("학생이 공부하다");
	}
	
	public void study2(String subject) {
		System.out.println(subject + " 공부하다");
	}
	
	//Worker method(return type이 존재하는 경우)
	public String study3(String subject) {
		String info = subject + " 열공하다.";
		return info;
	}
}
