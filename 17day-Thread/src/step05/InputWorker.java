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
	 * ��������� �и��Ͽ�, ���������� �ش� �޼ҵ带 ȣ���ϴ� ���
	 */
	public void input() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("ģ������ �޼����� �Է¹޴� input thread: "+i);
			Thread.sleep(200);
		}
	}

}
