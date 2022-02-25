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
			pw = new PrintWriter(new FileWriter(path, true),true); //auto flush, close를 안해도 println 즉시 출력
			while (true) {
				System.out.println("메뉴를 주문하세요: ");
				String food = s.nextLine();
				if (food.equals("종료")) {
					System.out.println("주문이 완료되었습니다.");
					break;
				}
				pw.println(food);
				//printwriter true -> auto flush
				System.out.println(food + "이(가) 주문되었습니다.");
			}
			//auto flush를 하여도 기본적으로 close는 필수적으로 작성!
		} finally {
			if (s != null)
				s.close();
			if (pw != null)
				pw.close();
		}
	}
}
