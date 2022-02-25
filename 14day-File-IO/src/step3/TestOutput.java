package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		// ������ �����ϰ� ���Ͽ� ���ڿ��� ���
		// Writer (output ���ڿ� ��Ʈ��)
		// NodeStream : ���� ��ġ�� ���� > FileWriter
		// processingStream : �پ��� ����� ����
		// �� PrinterWriter (println() , �� ���ξ� ���ڿ� ���)
		try {
			String path = "C:" + File.separator + "kosta238" + File.separator + "iotest" + File.separator + "output.txt";
			FileWriter fw = new FileWriter(path,true);//true : append
			PrintWriter pw = new PrintWriter(fw);
			/*
			 * FileWriter��� Nodestream�� output.txt��� ��ġ(data)�� ���� ����Ǿ���.
			 * 	�� Nodestream ��ü�� �޾Ƽ� processing stream�� �̸� Ȱ���Ͽ� �������� �����Ѵ�.
			 */
			pw.println("�������ø�"); //�̾����ִ� ��� ��ġ�� data write 
			pw.close(); //stream close(buffer�� �ִ� ������ ��� ��ġ�� �����ش�(flush, �����Ѵ�).
			/*
			 * �ݵ�� close �ʿ�(close�� ���ÿ� buffer�� ������ data�� ����)
			 * �ϴ��� buffer�� ����, close�� �ϸ鼭 ���������� ��� ��ġ�� ������(flush).
			 */
			System.out.println("������ �����Ǿ����ϴ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
