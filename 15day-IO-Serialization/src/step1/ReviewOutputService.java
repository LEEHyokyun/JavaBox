package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReviewOutputService {
	private String path;

	public ReviewOutputService(String path) {
		super();
		this.path = path;
	}

	public void order() throws IOException {
		Scanner s = null;
		PrintWriter pw = null;
		try {
			s = new Scanner(System.in);
			pw = new PrintWriter(new FileWriter(path, true),true); //auto flush, close�� ���ص� println ��� ���
			while (true) {
				System.out.println("�޴��� �ֹ��ϼ���: ");
				String food = s.nextLine();
				if (food.equals("����")) {
					System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
					break;
				}
				pw.println(food);
				//printwriter true -> auto flush
				System.out.println(food + "��(��) �ֹ��Ǿ����ϴ�.");
			}
			//auto flush�� �Ͽ��� �⺻������ close�� �ʼ������� �ۼ�!
		} finally {
			if (s != null)
				s.close();
			if (pw != null)
				pw.close();
		}
	}
}
