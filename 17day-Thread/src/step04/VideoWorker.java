package step04;

public class VideoWorker implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("video service thread is running: "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*
			 * sleep
			 * 해당 시간동안 잠시 스레드를 멈춘 후에 다시 실행한다.
			 */
		}
	}

}
