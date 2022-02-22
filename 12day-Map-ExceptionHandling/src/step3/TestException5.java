package step3;

public class TestException5 {
	public static void main(String[] args) {
		String money = "이백";

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
