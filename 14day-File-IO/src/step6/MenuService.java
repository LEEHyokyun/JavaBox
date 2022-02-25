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
			System.out.println("저녁메뉴를 주문하세요: ");
			String menu = s.nextLine();
			System.out.println(menu+"을(를) 주문하였습니다.");
			
			if(menu.equals("종료")) break;
			
			pw.println(menu);
			pw.close();
		}
		s.close();
		System.out.println("주문이 완료되었습니다.");
	}
}