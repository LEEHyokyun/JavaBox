package step14;

public class Theater implements Runnable{
	private int seatNum = 1;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		reserve(name);
	}
	
	public synchronized void reserve(String name) {
		System.out.println(name+" 손님이 "+seatNum+"번 좌석을 예매하였습니다.");
		seatNum++;
	}
	
}
