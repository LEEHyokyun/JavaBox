package step13;

public class Toilet implements Runnable{
	/*
	 * Ư�� ������ sychronized Ű���带 �̿��Ͽ� ����ȭó���Ѵ�.
	 */
	private boolean seat;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		try {
			use(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void use(String name) throws InterruptedException {
		/*
		 * synchronized Ű���带 ����Ѵٸ�, �ϳ��� �����忡���� ȣ���� �� �ִ�.
		 * �ٸ� ���������, �ش� �����尡 ����ȭ �޼ҵ� ������ �Ϸ��� ������ ����Ѵ�.
		 */
		if(!seat) {
			System.out.println(name+"���� �����Ͽ����ϴ�.");
			Thread.sleep(1000);
			seat = true;
			System.out.println(name+"���� ��� ���Դϴ�.");
			Thread.sleep(3000);
			System.out.println(name+"���� ����� �Ϸ��Ͽ����ϴ�.");
			seat = false;
		}else {
			System.out.println("���� ȭ����� �̿� ���̹Ƿ� "+name+"���� �̿��� �� �����ϴ�.");
		}
		/* �Ʒ��� ���� Ư�� �κп� ���ؼ��� ����ȭó���� �� �ִ�.
		 * synchronized(this){
		 * 	System.out.println(name+"���� �����Ͽ����ϴ�.");
			Thread.sleep(1000);
			seat = true;
			System.out.println(name+"���� ��� ���Դϴ�.");
			Thread.sleep(3000);
			System.out.println(name+"���� ����� �Ϸ��Ͽ����ϴ�.");
			seat = false;
		 * }
		 * 
		 */
	}
	
	
}
