package step2;

public class ReviewException extends Exception{
	private static final long serialVersionUID = 98093092402L;
	public ReviewException(String message) {
		//Exception super class�� message �Ҵ�
		//���� getMessage�� ���� ����ó��
		super(message);
		System.out.println("Exception ��ü�� �����Ǿ����ϴ�.");
	}
}
