package test;

import java.util.Scanner;

public class UnitTestLabel {
	// label in condition or loop
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		exit: // break 레이블명을 명시하면 while 문 탈출이 가능하다.
		while (true) {
			System.out.println("1.등록 2.종료");
			String info = s.nextLine();
			switch (info) {
			case "1":
				System.out.println("등록");
				break;
			case "2":
				System.out.println("종료");
				break exit; //switch escape
				//while문을 벗어나고자 한다면 label 이용
			}
		}
		s.close();
	}
}
