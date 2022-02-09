package step1;

import java.util.Scanner;

public class TestSwitch2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("등급을 입력하세요:");
		int grade = s.nextInt();
		
		//별도의 break가 없다면 조건에 맞는 case 구문을 실행한다.
		//탈출을 위해서는 반드시 break 작성 필요.
		switch(grade) {
		case 1:
			System.out.println("This is one");
			break;
		case 2:
			System.out.println("This is two");
			break;
		case 3: case 4: case 5: //여러 경우를 한 줄에 작성 가능
			System.out.println("This is three, four, five");
			break;
		default:
			System.out.println("This is another case");
		}
		s.close(); //IO stream에 따라 in을 하였으면 반드시 out을 한다.
	}
}
