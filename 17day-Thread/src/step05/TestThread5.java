package step05;
/*
 * multi thread 기본 구성 - input / output thread
 * chatting / client process
 */
public class TestThread5 {
	public static void main(String[] args) {
		Thread inputThread = new Thread(new InputWorker());
		Thread outputThread = new Thread(new OutputWorker());
		/*
		 * 종료이벤트!
		 */
		inputThread.start();
		outputThread.start();
		System.out.println("main thread가 종료되었습니다.");
	}
}
