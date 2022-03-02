package step04;

public class AudioWorker implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Audio service thread is running: "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
