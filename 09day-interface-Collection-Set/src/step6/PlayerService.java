package step6;

public class PlayerService {
	public void proceed(Player p) {
		if(p instanceof CDPlayer) {
			((CDPlayer) p).insertCd();
		}
		p.play();
	}
}
