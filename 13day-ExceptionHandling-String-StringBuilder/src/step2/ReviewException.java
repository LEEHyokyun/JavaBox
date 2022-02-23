package step2;

public class ReviewException extends Exception{
	private static final long serialVersionUID = 98093092402L;
	public ReviewException(String message) {
		//Exception super class에 message 할당
		//이후 getMessage를 통해 예외처리
		super(message);
		System.out.println("Exception 객체가 생성되었습니다.");
	}
}
