package step6.test;

import step6.access.Bank;

public class KostaBank extends Bank{
	public void accessTest() {
		//�⺻������ ��ӹ޾Ұ�, public method�̹Ƿ� �ٷ� ��밡��
		publicTest();
		//protected�̹Ƿ� �ٸ� ��Ű�������� ��ӹ޾����Ƿ� ��밡��
		protectedTest();
		//default,private ���Ұ�
		//defaultTest(); //�ٸ� ��Ű������ ���� �Ұ�
		//privateTest(); //�ڽ��� Ŭ���� �������� ��밡��
	}
}
