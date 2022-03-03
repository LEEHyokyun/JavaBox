package step12;

public class Toilet implements Runnable{
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
	
	public void use(String name) throws InterruptedException {
		if(!seat) {
			System.out.println(name+"���� �����Ͽ����ϴ�.");
			Thread.sleep(1000);
			/*
			 * seat�� false -> true�� �ٲ�� �� ������ ��Ƽ������ ��������, �ڿ�������
			 */
			seat = true;
			System.out.println(name+"���� ��� ���Դϴ�.");
			Thread.sleep(3000);
			System.out.println(name+"���� ����� �Ϸ��Ͽ����ϴ�.");
		}else {
			System.out.println("���� ȭ����� �̿� ���̹Ƿ� "+name+"���� �̿��� �� �����ϴ�.");
		}
	}
	
	
}
