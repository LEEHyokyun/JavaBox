package step7;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String name = "������";
		System.out.println(name);
		System.out.println(name.concat("¯"));
		System.out.println(name); //String�� ������� .. ���ο� ���ڿ��� ����
		String name2 = "������";
		/*
		 * ������ ���ڿ� ��� �������� ������ ���ڿ� "������"��
		 * ���� �ٸ� name, name2 (stack)�� �̸� �����ϴ� ����̴�(=����)
		 */
		
		StringBuilder sb = new StringBuilder("�ں���");
		System.out.println(sb.append("��")); //����, ������ü�� ����
	}
}
