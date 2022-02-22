package step5;
/*
 * Exception Handling : 	예외상황 발생시 대처방안을 정의하고 실행하는데 그 목적이 있다.
 */
/*
 * 사용자가 정의하는 Exception, Exception class를 상속받아 사용한다.
 */
public class TestThrow1 {
	public static void main(String[] args) {
		MovieService service = new MovieService();
		int age = 11;
		
		try{
			service.enter(age);
		}catch(AgeException e) {
			//e.printStackTrace();
			//exception에서 메시지만 따로 출력
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램이 정상 수행되었습니다.");
	}
}
/*
 * 객체생성 
 *  finally
 *  그 후에 throws
*/