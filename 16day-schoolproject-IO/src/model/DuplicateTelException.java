package model;

public class DuplicateTelException extends Exception{
	private static final long serialVersionUID = 1L;

	//private static final long serialVersionUID = 12954923300L;
	
	public DuplicateTelException(String message){
		super(message);
		//DuplicateTelException �߻��� ������ message�� exception�� �Ҵ�
		//���� getMessage�� ���� message ��� ����
	}
}
