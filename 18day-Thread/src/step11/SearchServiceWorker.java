package step11;

public class SearchServiceWorker implements 	Runnable{
	/*
	 * 인스턴스변수는 heap에 저장
	 * 멀티스레드들이 해당 heap 자원들은 공유해서 사용할 수 있다.
	 */
	private String shareInfo = "검색서비스 공유자원";
	private int testCount;
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		testCount = testCount + 1;
		for(int i=0;i<5;i++) {
			/*
			 * i는 stack, local variable
			 */
			System.out.println(threadName+"의 고객이 "+shareInfo+"을 사용 중");
			System.out.println(threadName+"의 고객이 다녀간 후 "+testCount+"값으로 변화하였습니다.");
		}
	}
	
}
