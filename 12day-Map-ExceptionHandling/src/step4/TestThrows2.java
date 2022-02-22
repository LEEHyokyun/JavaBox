package step4;

import java.io.FileNotFoundException;
/*
 * main throws exception.
 */
public class TestThrows2 {
	public static void main(String[] args) throws FileNotFoundException{
		//exception thorw는 연쇄전파가 가능하다.
		MemoService service = new MemoService();
		String filePath = "C:\\kosta238\\test1.txt";

		service.readMemo(filePath);
		
		System.out.println("프로그램이 정상 수행되었습니다");
	}
	/*
	 * main 에서 throw를 한다면
	 * 최종적으로 JVM측으로 exception을 throw하게되어, 후속작업이 이루어지지 않는다.
	 * 즉 정상진행불가, 예외처리불가.
	 */
}
