package step3;
/*
 * case 2 : NullPointerException�� ���� ����ó��
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
		 * Exception �߻� �� �޼��� ��� �� ����
		 * NullPointerException
		 */
		System.out.println("���α׷� ���� ����");
	}
}
