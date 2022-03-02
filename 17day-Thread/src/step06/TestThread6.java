package step06;
/*
 * Runnable 하위 클래스에서 다수의 스레드를 생성
 */
public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("**main thread가 실행되었습니다.**");
		ServerWorker worker = new ServerWorker();
		Thread thread1 = new Thread(worker, "A");
		//각 thread에 이름 할당가능
		thread1.start();
		Thread thread2 = new Thread(worker, "B");
		//각 thread에 이름 할당가능
		thread2.start();
		/*
		 * Runnable 하위 클래스에서 다수의 스레드를 생성하는 경우
		 * 즉, 동일한 하위 클래스 상에서 여러 Thread 객체를 생성하여
		 * 다중 thread, 다수의 스레드를 생성하는 경우
		 */
		/*
		 * 다수의 클라이언트가 한 서버에 입장할 경우 :
		 * 다수의 클라이언트에게 각 서버 서비스를 동시에 처리해야하는 경우이다.
		 * 즉 동일한 서비스를, 여러개의 스레드로 만들어 여러 스레드 상에서 동시적으로 처리하는 경우
		 * * 각 스레드가 생성된다면 독자적인 stack 메모리를 할당하고 변수도 여기에 저장된다.
		 */
		System.out.println("**main thread가 종료되었습니다.**");
	}
}
