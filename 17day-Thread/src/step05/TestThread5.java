package step05;
/*
 * multi thread �⺻ ���� - input / output thread
 * chatting / client process
 */
public class TestThread5 {
	public static void main(String[] args) {
		Thread inputThread = new Thread(new InputWorker());
		Thread outputThread = new Thread(new OutputWorker());
		/*
		 * �����̺�Ʈ!
		 */
		inputThread.start();
		outputThread.start();
		System.out.println("main thread�� ����Ǿ����ϴ�.");
	}
}
