package step5;

public class TestConstructor2 {
	public static void main(String[] args) {
		CreditCard c = new CreditCard();
		c.setPersonalInfo("���� ��������");
		System.out.println(c.getPersonalInfo());
		System.out.println("******************");
		

		//�����ڰ� ��õ� ���
		//������ ���ڸ� �����ؾ� �ش� ��ü�� ������ �� �ִ�.
		CreditCard2 c2 = new CreditCard2("���� ��������2");
		System.out.println(c2.getPersonalInfo());
		c2.setPersonalInfo("���� ��������");
		System.out.println(c2.getPersonalInfo());
	}
}
