package step3;
/*
 * case 1 : ���α׷� ����� Exception �߻��� JVM���� Exception �߻� �� ����
 */
public class TestException1 {
	public static void main(String[] args) {
		String name = null;
		System.out.println(name.length());
		/*
		 * Exception �߻� �� �޼��� ��� �� ����
		 * NullPointerException
		 */
		System.out.println("���α׷� ���� ����");
	}
}
