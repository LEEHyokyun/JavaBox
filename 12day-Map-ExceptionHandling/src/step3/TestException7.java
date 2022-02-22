package step3;

import java.util.Scanner;

public class TestException7 {
	public static void main(String[] args) {
		/*
		 * Scanner s = new Scanner(System.in); //입력 s.close(); //Scanner 사용후 close, IO
		 * Stream 관련 제원공유가 가능해진다.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		String info = s.nextLine(); // 한 라인씩 정보 입력
		try{
			int age = Integer.parseInt(info);
			if (age > 19) {
				System.out.println("당신은 성인입니다");
			} else {
				System.out.println("당신은 미성년입니다");

			}
		}catch(NumberFormatException e) {
			System.out.println(e);
		}finally {
			s.close();
		}
	}
}
