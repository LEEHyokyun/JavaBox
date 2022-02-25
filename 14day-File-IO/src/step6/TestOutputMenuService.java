package step6;

import java.io.File;
import java.io.IOException;

public class TestOutputMenuService {
	/*
	 * 저녁메뉴를 주문하세요: 마라탕
	 * 마라탕 주문
	 * 저녁메뉴를 주문하세요: 햄버거
	 * 햄버거 주문
	 * 저녁메뉴를 주문하세요: 종료
	 * 주문이 완료되었습니다
	 * 
	 * iotest\menu.txt에 정보가 저장
	 */
	public static void main(String[] args) {
		String path = "C:" + File.separator + "kosta238" + File.separator + "iotest" + File.separator + "menu.txt";
		MenuService service = new MenuService(path);
		
		try {
			service.orderMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
