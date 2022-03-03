package step13;

public class Toilet implements Runnable{
	/*
	 * 특정 영역을 sychronized 키워드를 이용하여 동기화처리한다.
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
		 * synchronized 키워드를 사용한다면, 하나의 스레드에서만 호출할 수 있다.
		 * 다른 스레드들은, 해당 스레드가 동기화 메소드 실행을 완료할 때까지 대기한다.
		 */
		if(!seat) {
			System.out.println(name+"님이 입장하였습니다.");
			Thread.sleep(1000);
			seat = true;
			System.out.println(name+"님이 사용 중입니다.");
			Thread.sleep(3000);
			System.out.println(name+"님이 사용을 완료하였습니다.");
			seat = false;
		}else {
			System.out.println("현재 화장실을 이용 중이므로 "+name+"님은 이용할 수 없습니다.");
		}
		/* 아래와 같이 특정 부분에 대해서만 동기화처리할 수 있다.
		 * synchronized(this){
		 * 	System.out.println(name+"님이 입장하였습니다.");
			Thread.sleep(1000);
			seat = true;
			System.out.println(name+"님이 사용 중입니다.");
			Thread.sleep(3000);
			System.out.println(name+"님이 사용을 완료하였습니다.");
			seat = false;
		 * }
		 * 
		 */
	}
	
	
}
