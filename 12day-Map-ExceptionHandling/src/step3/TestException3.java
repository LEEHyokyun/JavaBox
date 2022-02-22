package step3;

import java.util.ArrayList;

/*
 * case 3 : 다수의 Exception 발생상황에 대한 예외처리
 */
public class TestException3 {
	public static void main(String[] args) {
		String name = null;
		ArrayList<String> list = new ArrayList<String>();
		list.add("박보검");

		// 다수의 예외처리 = 여러번의 catch 구문사용!
		try {
			System.out.println(list.get(1));
			/*
			 * 가장 먼저 발생한 exception 상황에 대해서만 catch 구문을 실행한다. 즉 다시 말해, try 내에서 Exception 발생 즉시
			 * catch block으로 넘어간다(실행한다).
			 */
			System.out.println(name.length());
		} /*
			 * catch(Exception e) {
			 * 
			 * Exception은 super class!, 다형성을 적용하여 일괄처리 가능 그러나 super class에 대한 일괄처리는 권장하지
			 * 않는다.
			 * 
			 * System.out.println("catch"); }
			 */ 
		catch (NullPointerException e) {
			System.out.println(e);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		/*
		 * Exception 발생 및 메세지 출력 후 종료 NullPointerException
		 */
		System.out.println("프로그램 정상 수행");
	}
}
