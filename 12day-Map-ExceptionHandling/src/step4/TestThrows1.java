package step4;

import java.io.FileNotFoundException;

//throw�� ����� �޼��带 ����ϱ� ���� ȣ���� ���
//throw
//try-catch

public class TestThrows1 {
	public static void main(String[] args) {
		//exception thorw�� �������İ� �����ϴ�.
		MemoService service = new MemoService();
		String filePath = "C:\\kosta238\\test1.txt";
		try {
			service.readMemo(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("File ó���� Exception�� �߻��Ͽ����ϴ�");
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�");
	}
}
