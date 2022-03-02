package step07;

public class Word implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BackupWorker worker = new BackupWorker();
			Thread backupThread = new Thread(worker);
			backupThread.setDaemon(true); 
			//backup thread�� daemon thread�� ����
			//�ڽ��� ȣ���� word �����尡 ����ȴٸ� �ڵ� ����ȴ�.
			backupThread.start();
			//backup thread ȣ�� �� ���������� ���, word �����
			execute();
			worker.backup(); 
			//word ���� ���� ����� ����Ͽ� �ѹ��� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void execute() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("word �����۾��� ������: "+i);
		}
		Thread.sleep(500);
	}

}
