package step05;

public class OutputWorker implements Runnable {

	@Override
	public void run() {
		try {
			output();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void output() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("ģ���鿡�� �޼����� ����ϴ� output thread: "+i);
			Thread.sleep(200);
		}
	}
}