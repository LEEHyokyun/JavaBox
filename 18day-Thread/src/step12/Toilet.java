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
			System.out.println(name+"님이 입장하였습니다.");
			Thread.sleep(1000);
			/*
			 * seat이 false -> true로 바뀌는 그 순간에 멀티스레드 동시접근, 자원공유함
			 */
			seat = true;
			System.out.println(name+"님이 사용 중입니다.");
			Thread.sleep(3000);
			System.out.println(name+"님이 사용을 완료하였습니다.");
		}else {
			System.out.println("현재 화장실을 이용 중이므로 "+name+"님은 이용할 수 없습니다.");
		}
	}
	
	
}
