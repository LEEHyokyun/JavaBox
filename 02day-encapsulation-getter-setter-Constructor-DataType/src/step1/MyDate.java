package step1;

public class MyDate {
	//default 접근 제어자로 외부 클래스에서 접근 가능
	//잘못된 day value를 할당할 수도 있다.
	int day;
	//private 이므로 외부 클래스에서 접근 불가
	//private 접근 제어자로 외부 접근 차단하였음
	private int encapsulDay;
	//enDay 인스턴스 변수에 대해 setter getter method를 정의하여
	//외부에서는 setter, getter를 이용하여 enDay 인스턴스변수에 간접 접근하도록 설정
	
	//setter method
	public void setEncapsulDay(int d) {
		if(d>0 && d<32) {
			encapsulDay = d;
		}else {
			System.out.println("잘못된 입력입니다.");
			encapsulDay = 1;
		}
	}
	//getter method
	public int getEncapsulDay() {
		return encapsulDay;
	}
	
}
