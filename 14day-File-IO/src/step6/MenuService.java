package step6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {
	private String path;

	public MenuService(String path) {
		this.path = path;
	}
	
	public void orderMenu() throws IOException {
		Scanner s = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new FileWriter(path));
		
		while(true) {
			System.out.println("����޴��� �ֹ��ϼ���: ");
			String menu = s.nextLine();
			System.out.println(menu+"��(��) �ֹ��Ͽ����ϴ�.");
			
			if(menu.equals("����")) break;
			
			pw.println(menu);
			pw.close();
		}
		s.close();
		System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.");
	}
}