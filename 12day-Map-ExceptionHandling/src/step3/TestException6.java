package step3;

public class TestException6 {
	public static void main(String[] args) {
		String money = "200";
		/*
		 * ���������� ������ ��쿣 catch ������ ������� �ʴ´�.
		 */
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
