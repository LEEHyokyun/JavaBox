package step3;
/*
 * case 1 : 프로그램 실행시 Exception 발생시 JVM에서 Exception 발생 및 종료
 */
public class TestException1 {
	public static void main(String[] args) {
		String name = null;
		System.out.println(name.length());
		/*
		 * Exception 발생 및 메세지 출력 후 종료
		 * NullPointerException
		 */
		System.out.println("프로그램 정상 수행");
	}
}
