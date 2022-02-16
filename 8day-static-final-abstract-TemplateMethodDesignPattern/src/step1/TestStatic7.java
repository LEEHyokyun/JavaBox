package step1;

public class TestStatic7 {
	public static void main(String[] args) {
		System.out.println("main method 실행");
	}
	
	//static 초기화 영역
	//static 초기화 영역은 main method 내부에서 우선적으로 실행되는 영역
	static {
		System.out.println("static 초기화 영역");
	}
}
