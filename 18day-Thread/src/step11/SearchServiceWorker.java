package step11;

public class SearchServiceWorker implements 	Runnable{
	/*
	 * �ν��Ͻ������� heap�� ����
	 * ��Ƽ��������� �ش� heap �ڿ����� �����ؼ� ����� �� �ִ�.
	 */
	private String shareInfo = "�˻����� �����ڿ�";
	private int testCount;
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		testCount = testCount + 1;
		for(int i=0;i<5;i++) {
			/*
			 * i�� stack, local variable
			 */
			System.out.println(threadName+"�� ���� "+shareInfo+"�� ��� ��");
			System.out.println(threadName+"�� ���� �ٳణ �� "+testCount+"������ ��ȭ�Ͽ����ϴ�.");
		}
	}
	
}
