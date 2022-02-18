package step9;

import java.util.Scanner;

public class TestIf2 {
	//사용자(client) side
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("태어난 달을 입력하세요");
		System.out.println(s.nextInt());
		//입력 후 기본형 변수에 저장
		int m = s.nextInt();
		Mydate d = new Mydate(m);
		
		int month = d.getMonth();
		
		if(month != -1) { //-1이 아니라면 아래 구문이 실행된다.
		System.out.println("당신은 "+month+"월에 태어났습니다.");
		}
		
		s.close();
	}
}
