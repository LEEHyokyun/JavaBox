package step5;

public class AgeException extends Exception{
	private static final long serialVersionUID = 1L;
	public AgeException(String message) {
		super(message);
		System.out.println("Exception 객체가 생성되었습니다");
	}
}
