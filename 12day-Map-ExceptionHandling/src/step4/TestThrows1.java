package step4;

import java.io.FileNotFoundException;

//throw가 선언된 메서드를 사용하기 위해 호출할 경우
//throw
//try-catch

public class TestThrows1 {
	public static void main(String[] args) {
		//exception thorw는 연쇄전파가 가능하다.
		MemoService service = new MemoService();
		String filePath = "C:\\kosta238\\test1.txt";
		try {
			service.readMemo(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("File 처리간 Exception이 발생하였습니다");
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 수행되었습니다");
	}
}
