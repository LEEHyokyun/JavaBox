package step14;

//멀티 스레드 환경에서의 동기화 처리
public class TestThread13 {
	public static void main(String[] args) {
		Theater theater = new Theater();
		Thread t1 = new Thread(theater);
		Thread t2 = new Thread(theater);
		
		t1.start();
		t2.start();
	}
}
