package step07;

public class BackupWorker implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			/*
			 * backup�� ������ word thread�� �̸� ȣ�� �� ���������� ������ ��������尡 ����
			 * ���������� �ڽ��� ȣ���� word thread�� ����ɶ����� ������ �����Ѵ�.
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
		 * 3�� �������� ����۾� ����
		 */
		Thread.sleep(30);
		System.out.println("");
	}
}
