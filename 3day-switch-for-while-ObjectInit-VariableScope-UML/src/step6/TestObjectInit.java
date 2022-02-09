package step6;

public class TestObjectInit {
	public static void main(String[] args) {
		Mydate date = new Mydate(29);
		
		System.out.println(date.getDay1()); //기본초기화
		System.out.println(date.getDay2()); //생성자초기화
		// + 명시적 초기화
		
		System.out.println(date.isFlag()); //기본 초기화(false)
		System.out.println(date.getName()); //기본 초기화(null)
	}
}
