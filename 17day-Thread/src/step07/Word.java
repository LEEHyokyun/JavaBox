package step07;

public class Word implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BackupWorker worker = new BackupWorker();
			Thread backupThread = new Thread(worker);
			backupThread.setDaemon(true); 
			//backup thread를 daemon thread로 설정
			//자신을 호출한 word 스레드가 종료된다면 자동 종료된다.
			backupThread.start();
			//backup thread 호출 및 개별적으로 백업, word 실행됨
			execute();
			worker.backup(); 
			//word 종료 직전 백업을 명기하여 한번더 저장
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void execute() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("word 문서작업이 실행중: "+i);
		}
		Thread.sleep(500);
	}

}
