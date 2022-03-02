package step05;

public class InputWorker implements Runnable {

	@Override
	public void run() {
		try {
			input();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 기능적으로 분리하여, 내부적으로 해당 메소드를 호출하는 방식
	 */
	public void input() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("친구들의 메세지를 입력받는 input thread: "+i);
			Thread.sleep(200);
		}
	}

}
