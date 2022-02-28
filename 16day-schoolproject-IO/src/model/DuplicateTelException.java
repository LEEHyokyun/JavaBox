package model;

public class DuplicateTelException extends Exception{
	private static final long serialVersionUID = 1L;

	//private static final long serialVersionUID = 12954923300L;
	
	public DuplicateTelException(String message){
		super(message);
		//DuplicateTelException 발생시 정의한 message를 exception에 할당
		//이후 getMessage를 통해 message 출력 가능
	}
}
