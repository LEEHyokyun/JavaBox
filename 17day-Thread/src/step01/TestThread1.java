package step01;
/*
 *  main thread의 실행 = 하나의 프로세스의 실행
 */
class SingleThreadTest{
	public void test() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread in processing: "+i);
		}
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		SingleThreadTest t = new SingleThreadTest();
		t.test();
		/*
		 * main 단일 스레드 .. 동시 실행이 불가능한 구조
		 */
		System.out.println("main thread가 종료되었습니다.");
	}
}
