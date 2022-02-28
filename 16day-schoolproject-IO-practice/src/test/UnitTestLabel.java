package test;

import java.util.Scanner;

public class UnitTestLabel {
	public static void main(String[] args) {
		// 제어문에서 label 사용 예제
		Scanner s = new Scanner(System.in);
		exit: // label -> break 레이블명을 명시하면 아래의 while문을 벗어날 수 있다 
		while(true) {
			System.out.print("1.등록  2.종료");
			String info=s.nextLine();
			switch(info) {
			case "1":
				System.out.println("등록작업진행");
				break;//현재 switch 문을 벗어난다 
			case "2":
				System.out.println("종료");
				//while 문을 벗어나고자 한다면 label을 이용한다 
				break exit;
			}
		}		
		s.close();
	}
}
