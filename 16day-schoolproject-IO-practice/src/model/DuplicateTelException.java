package model;

public class DuplicateTelException extends Exception{
	//이후 공부예정 
	private static final long serialVersionUID = 1955721522384187141L;
	public DuplicateTelException(String message) {
		super(message);// 부모 Exception 의 생성자를 이용해 메세지를 할당 , 이후 catch 구문에서 getMessage()로 반환받을 수 있다
	}
}
