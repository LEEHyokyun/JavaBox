package step4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MemoService {
	public void readMemo(String filePath) throws FileNotFoundException{
		/*
		 * thorw�� �޼ҵ� �������� ����Ǵ� ����ó�� �������̴�.
		 * �ش� �޼ҵ带 �����ϸ鼭 exception�� �߻��Ͽ��� ���, �� �޼ҵ带 ȣ���� ������ ó���ϵ��� throw
		 * ���� �ش� �޼ҵ带 ȣ���� Ŭ������ ��ü������, �ݵ�� try-catch ������ �ۼ����־�� �Ѵ�.
		 */
		FileReader fr = new FileReader(filePath);
		System.out.println("������ �Է¹޴� �۾��� �����Ͽ����ϴ�");
	}
}
