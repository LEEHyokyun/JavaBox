package step11;

public class TestThread10 {
	public static void main(String[] args) {
		SearchServiceWorker sw = new SearchServiceWorker();
		Thread t1 = new Thread(sw, "1번 고객에 대한 검색서비스 스레드");
		Thread t2 = new Thread(sw, "2번 고객에 대한 검색서비스 스레드");
		Thread t3 = new Thread(sw, "3번 고객에 대한 검색서비스 스레드");
		
		t1.start();
		t2.start();
		t3.start();
		
		//heap 영역에 생성된 인스턴스 변수들은
		//동일한 하위 객체로부터 생성된 멀티 스레드들이 공유한다.
	}
}
