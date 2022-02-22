package step4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MemoService {
	public void readMemo(String filePath) throws FileNotFoundException{
		/*
		 * thorw는 메소드 단위에서 기재되는 예외처리 수행방법이다.
		 * 해당 메소드를 수행하면서 exception이 발생하였을 경우, 이 메소드를 호출한 측에서 처리하도록 throw
		 * 따라서 해당 메소드를 호출한 클래스나 객체측에서, 반드시 try-catch 구문을 작성해주어야 한다.
		 */
		FileReader fr = new FileReader(filePath);
		System.out.println("파일을 입력받는 작업을 수행하였습니다");
	}
}
