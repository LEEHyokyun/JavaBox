package step4;

import java.io.FileNotFoundException;
/*
 * main throws exception.
 */
public class TestThrows2 {
	public static void main(String[] args) throws FileNotFoundException{
		//exception thorw�� �������İ� �����ϴ�.
		MemoService service = new MemoService();
		String filePath = "C:\\kosta238\\test1.txt";

		service.readMemo(filePath);
		
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�");
	}
	/*
	 * main ���� throw�� �Ѵٸ�
	 * ���������� JVM������ exception�� throw�ϰԵǾ�, �ļ��۾��� �̷������ �ʴ´�.
	 * �� ��������Ұ�, ����ó���Ұ�.
	 */
}
