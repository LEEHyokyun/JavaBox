package step3;

public class TestException4 {
	/*
	 * finally : exception 발생 유무에 상관없이 항상 실행한다.
	 */
	public static void main(String[] args) {
		//String age = "22";
		String age = "스물둘";
		/*
		 * NumberFormatException
		 */
		System.out.println(age+1);
		try {
			int ageNum = Integer.parseInt(age); //Exception 발생지점
			System.out.println(ageNum); //실행지점
			/*
			 * Exception try 처리는 발생예상지점과 실행지점 모두 포괄하도록!
			 */
		}catch(NumberFormatException e){
			System.out.println(e);
		}finally {
			System.out.println("finally block");
		}
		
	}
}
