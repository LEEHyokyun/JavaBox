package step3;

import java.util.ArrayList;

/*
 * case 3 : �ټ��� Exception �߻���Ȳ�� ���� ����ó��
 */
public class TestException3 {
	public static void main(String[] args) {
		String name = null;
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ں���");

		// �ټ��� ����ó�� = �������� catch �������!
		try {
			System.out.println(list.get(1));
			/*
			 * ���� ���� �߻��� exception ��Ȳ�� ���ؼ��� catch ������ �����Ѵ�. �� �ٽ� ����, try ������ Exception �߻� ���
			 * catch block���� �Ѿ��(�����Ѵ�).
			 */
			System.out.println(name.length());
		} /*
			 * catch(Exception e) {
			 * 
			 * Exception�� super class!, �������� �����Ͽ� �ϰ�ó�� ���� �׷��� super class�� ���� �ϰ�ó���� ��������
			 * �ʴ´�.
			 * 
			 * System.out.println("catch"); }
			 */ 
		catch (NullPointerException e) {
			System.out.println(e);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		/*
		 * Exception �߻� �� �޼��� ��� �� ���� NullPointerException
		 */
		System.out.println("���α׷� ���� ����");
	}
}
