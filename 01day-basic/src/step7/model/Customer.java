package step7.model;

public class Customer {
	//public am : �ٸ� ��Ű�������� ���� ����
	public String password1 = "Hello";
	//protected am : ���� ��Ű��������, ����� Ŭ���������� ���
	protected String password2 = "Hi";
	//default am : ���� ��Ű�������� ���� ����
	String password3 = "HelloHi";
	//private�� ���� Ŭ���� �������� ���� ����
	private String password4 = "HH";
	//���� Ŭ���� ������ private ���� ���
	public String getPassword4() {
		return password4;
	}
}
