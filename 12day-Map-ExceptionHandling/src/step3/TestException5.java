package step3;

public class TestException5 {
	public static void main(String[] args) {
		String money = "�̹�";

		try {
			int num = Integer.parseInt(money); //exception �߻����� catch ����
			System.out.println("a");
		} catch (NumberFormatException e) {
			System.out.println("b");
		} finally {
			System.out.println("c");
		}
		System.out.println("d");
	}
}
