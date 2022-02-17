package step6;

public class CDPlayer implements Player {
	@Override
	public void play() {
		System.out.println("CDplayer played");
	}
	
	//CD player own method
	public void insertCd() {
		System.out.println("CD inserted in CD player");
	}
}
