package step5;

public class TestMethod1 {
	public static void main(String[] args) {
		Student s = new Student(); //��ü ����
		s.study(); //calling method
		s.study2("Hello"); //calling method, passing argument
		String data = s.study3("����");
		System.out.println(data);
	}
}
