package step10;
/*
 * multi thread
 * 
 * 1. MAKE_PATH에 1초 간격 30번 반복하여, 30개의 파일 생성
 * 2. 확장자별로 파일을 구분하여, 특정 경로에 파일을 이동시킨다.
 * 	ㄴ 7초 간격으로 5번 반복실행
 */
/*
 * 기본적으로 다소 규모가 큰, 작업을 수행하는 2개의 멀티스레드 환경에서 실행!
 * 파일 생성 스레드, 파일 이동 스레드
 */
public class TestThread9 {
	public static void main(String[] args) {
		int makeCount = 30;
		int makePeriod = 1000;
		int moveCount = 5;
		int movePeriod = 7000;
		
		MakeFileWorker makeWorker = new MakeFileWorker(makeCount, makePeriod);
		Thread t1 = new Thread(makeWorker);
		t1.start();
		
		MoveFileWorker moveWorker = new MoveFileWorker(moveCount, movePeriod);
		Thread t2 = new Thread(moveWorker);
		t2.start();
		
	}
}
