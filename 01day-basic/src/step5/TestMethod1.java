package step5;

public class TestMethod1 {
	public static void main(String[] args) {
		Student s = new Student(); //객체 생성
		s.study(); //calling method
		s.study2("Hello"); //calling method, passing argument
		String data = s.study3("과학");
		System.out.println(data);
	}
}
