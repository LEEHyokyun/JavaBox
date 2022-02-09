package step7;

public class Person {
	private int money; //인스턴스 변수 - 기본 초기화 0
	public Person() {
		int i = 1; //생성자 내부에서 선언된 변수도 지역변수
	}
	public void test1() {
		int i = 5;//지역변수로 반드시 명시적 초기화 필요
		System.out.println(money);
	}
	
	public void test2(int money) {
		System.out.println(money);
		System.out.println(this.money);
	}
	
	public void test3() {
		if(money < 1){ //money > 인스턴스 변수를 가르킨다.
			int count = 1;
			System.out.println(count);
		}
		//System.out.println(count); //count는 if 내에서만 사용가능한 지역변수이다.
	}
	
	public void test4() {
		int count = 0;
		if(money < 1) {
			count = 1;
		}
		System.out.println(count);
	}
	
	public void test5() {
		int i = 1;
	}
	
	public void test6() {
	}
}
