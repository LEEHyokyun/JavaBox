package step1;

import java.util.Scanner;

public class TestSwitch1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("등급을 입력하세요:");
		int grade = s.nextInt();
		
		//별도의 break가 없다면 조건에 맞는 case 구문부터 지속 실행한다.
		switch(grade) {
		case 1:
			System.out.println("This is one");
		case 2:
			System.out.println("This is two");
		default:
			System.out.println("This is three");
		}
		s.close(); //IO stream에 따라 in을 하였으면 반드시 out을 한다.
	}
}
