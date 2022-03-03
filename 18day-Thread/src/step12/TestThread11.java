package step12;

public class TestThread11 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		
		Thread t1 = new Thread(toilet, "박보검");
		Thread t2 = new Thread(toilet, "강하늘");
		t1.start();
		t2.start();
		/*
		 * 멀티 스레드 환경에서 단순히 if 등의 조건문으로 제어하기는 힘들다!
		 */
	}
}
