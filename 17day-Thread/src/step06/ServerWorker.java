package step06;
/*
 * 하위 클래스에 대한 다수의 스레드가 생성될 경우
 * 스케쥴러에 의해 run() 메소드가 여러번 호출되지만
 * 스레드별로 stack 메모리에 생성되어, 각 stack 메모리 영역에서 정보가 생성 및 저장된다.
 * 이렇기때문에 각각 생성된 스레드별로 0,0,0 반복인자(i)(=지역변수)가 생성되며 동시에 누적되어 저장된다.
 */
public class ServerWorker implements Runnable{
	@Override
	//start()후 JVM이 해당 스레드를 스케쥴링 및 run 호출
	//그 후 스레드 실질적인 업무 수행
	public void run() {
		try {
			chatting();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void chatting() throws InterruptedException {
		/*
		 * thread의 name을 반환받을 수 있다.
		 */
		String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+ " ServerWorker is running: "+i);
			Thread.sleep(200);
		}
	}
}
