package step9;

public class Mydate {
	private int month = -1;
	
	public Mydate(int month) {
		//논리적인 알고리즘 부분은(조건문 등)
		//server side에서 작성해주는 것이 좋다.
		if(month > 0 && month <13) {
			this.month = month;
		} else {
			System.out.println("유효하지 않은 달입니다.");
		}
	}
	
	public int getMonth() {
		return month;
	}
	
}
