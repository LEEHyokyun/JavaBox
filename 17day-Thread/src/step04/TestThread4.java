package step04;

public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("main thread 실행되었습니다.");
		VideoWorker worker1 = new VideoWorker();
		Thread thread1 = new Thread(worker1);
		thread1.start();
		AudioWorker worker2 = new AudioWorker();
		Thread thread2 = new Thread(worker2);
		thread2.start();
		/*
		 * 출력시 뒤죽박죽 출력, 즉 각각의 스레드들이 멀티로 개별적으로 동작
		 * 사용자 입장에서는 동시에 실행되는 것처럼 보인다.
		 */
		System.out.println("main thread 종료되었습니다.");
		/*
		 * Thread.sleep을 활용할 경우 스케쥴링이 이리저리...동시 실행이 더욱 용이해짐
		 */
	}
}
