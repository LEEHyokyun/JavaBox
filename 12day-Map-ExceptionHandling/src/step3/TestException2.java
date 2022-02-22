package step3;
/*
 * case 2 : NullPointerException에 대한 예외처리
 */
public class TestException2 {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} catch(NullPointerException e) {
			System.out.println(e);
		}
		/*
		 * Exception 발생 및 메세지 출력 후 종료
		 * NullPointerException
		 */
		System.out.println("프로그램 정상 수행");
	}
}
