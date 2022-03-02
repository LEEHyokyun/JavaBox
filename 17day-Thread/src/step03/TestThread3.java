package step03;
/*
 * thread by implements
 */
class Worker implements Runnable{
	@Override
	public void run() {
		/*
		 * thread 실행내용 정의, run 내용 종료시 스레드 종료
		 * Start() 메소드로 Runnable 상태가 된다면, 스케쥴러(JVM)에 의해 호출
		 */
		for(int i=0;i<10;i++) {
			System.out.println("Worker in process "+i);
		}
	}
}
public class TestThread3 {
	public static void main(String[] args) {
		/*
		 * Worker 객체를 생성후
		 * thread 객체에 삽입
		 */
		Worker worker = new Worker();
		Thread thread = new Thread(worker);
		//Thread thread = new Thread(new Wokrer());
		/*
		 * Thread 객체의 생성자로 구성
		 */
		thread.start();
		
		System.out.println("***main thread 종료되었습니다.");
	}
}
