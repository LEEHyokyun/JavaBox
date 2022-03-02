package step02;
/*
 * multi thread
 * main thread, Worker thread
 */
class Worker extends Thread{
	@Override
	public void run() {
		/*
		 * Worker thread의 실행내용을 정의하는 메소드*오버라이드
		 * jvm에 의해 스레드가 스케쥴링되면 호출되는 메소드이다.
		 * 즉, running thread 상태가 된다면 run 메소드를 호출하여 해당 내용을 실행한다.
		 * 이 run 메소드 실행이 종료되었을때, 해당 스레드가 종료된다.
		 */
		for(int i=0;i<10;i++) {
			System.out.println("Worker thread in process "+i);
		}
	};
}

public class TestThread2 {
	public static void main(String[] args) {
		Worker thread = new Worker();
		/*
		 * main thread와 별도로 동작한다.
		 * 즉 멀티스레드로 동작하여, main thread 동작 완료 후 running state.
		 */
		thread.start();
		/*
		 * thread를 실행가능 상태, 즉 JVM이 스레드를 스케쥴링하도록
		 * 해당 스레드를 멀티스레드로 운용할 수 있도록 running 상태로 전환시킨다.
		 */	
		System.out.println("****mian thread가 종료되었습니다.****");
	}
	
}
