package step5;

import java.util.Scanner;

public class TestConsoleInput2 {
	/*
	 * 좋아하는 도시명을 입력하세요: 양주 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("좋아하는 도시명을 입력하세요: ");
			String city = s.nextLine();
			System.out.println("좋아하는 도시명: "+city);
			if(city.equals("종료")) break;
		}
		System.out.println("프로그램이 종료되었습니다.");
		s.close();
	}
}
