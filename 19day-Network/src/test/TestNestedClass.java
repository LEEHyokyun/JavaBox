package test;
/*
 * Nested Class ��ø Ŭ���� (inner class) : class ���ο��� class�� ����
 * Outer class, Inner class ����� private member�� ���� ����
 * Inner class�� Outerclass�� ��ü ������ ���ؼ��� ��ü ������ �����ϴ�.
 */
public class TestNestedClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		/*
		 * outer class ��ü ������ ����Ǿ��
		 * Inner class ��ü ���� �� �ش� ������� ������ �����ϴ�.
		 */
		i.test();
	}
}
