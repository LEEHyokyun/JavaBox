package step07;

public class BackupWorker implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			/*
			 * backup을 생성한 word thread가 이를 호출 및 내부적으로 영구히 백업스레드가 동작
			 * 백업스레드는 자신을 호출한 word thread가 종료될때까지 동작을 지속한다.
			 */
			while(true) {
				backup();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void backup() throws InterruptedException {
		/*
		 * 3초 간격으로 백업작업 진행
		 */
		Thread.sleep(30);
		System.out.println("");
	}
}
