//Package - ���丮���� Ŭ������ �з��Ͽ� ����
package step2;
//Ŭ���� ����
/*
 * public : ���� ���� ������ "���� ������", ��𼭳� ������ �����ϴ�.
 * class : class�� ���Ǹ� ���� Ű����(�����)
 * class name, �빮�ڷ� ����
 */
public class Person {
	/*
	 * ����(instance variable, �����ϴ� ��) - ��ü�� �Ӽ�(field)
	 * class variable�� �ƴ�(=static)
	 */
	String name = "������";
	/*
	 * �޼ҵ�(method) - ��ü�� ����� ����
	 */
	public void eat() {
		System.out.println(name+" �Դ�");
	}
}

//��ü������� ������ ��ǰ, ��ɺ��� ���ȭ�� �Ѵ�.
//application������ object�� �����ϱ� ���� Ʋ�� class�̴�.