package step8;

public class TestOperator {
	public static void main(String[] args) {
		//Java 연산자
		int i = 7;
		int j = 8;
		System.out.println(i*j);
		System.out.println(i%j);
		System.out.println(i==j);
		
		//증감연산자
		int k = 10;
		System.out.println(k++); //실행후 증가
		System.out.println(k);
		System.out.println(++k); //증가후 실행
		System.out.println(k--); //실행후 감소
		System.out.println(--k); //감소후 실행
		
		//변수누적
		int money = 100;
		money+=100;
		money-=50;
		System.out.println(money);
		
		//삼항연산자
		// (조건식)? 식1:식2 - 조건식이  참일때 식1 수행, 거짓일때 식2 수행
		int x = 10;
		int result = (x>0)? x+1:x-1;
		System.out.println(result);
		
		//and or 연산 - &&, ||
		// && : false를 만나는 순간 연산 종료, false 반환
		// & : false를 만나더라도 항목이 끝날때 까지 연산을 지속, 그 이후에 false 반환
	}
}
