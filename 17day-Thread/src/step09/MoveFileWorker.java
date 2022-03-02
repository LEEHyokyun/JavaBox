package step09;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;
	
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}

	@Override
	public void run() {
		makeDirs();
		moveFiles();
	}
	
	public void makeDirs() {
		
	}
	
	public void moveFiles() {
		
	}
}
