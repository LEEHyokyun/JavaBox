package step3;

public class TestException6 {
	public static void main(String[] args) {
		String money = "200";
		/*
		 * 정상적으로 실행할 경우엔 catch 구문이 실행되지 않는다.
		 */
		try {
			int num = Integer.parseInt(money); //exception 발생직후 catch 실행
			System.out.println("a");
		} catch (NumberFormatException e) {
			System.out.println("b");
		} finally {
			System.out.println("c");
		}
		System.out.println("d");
	}
}
