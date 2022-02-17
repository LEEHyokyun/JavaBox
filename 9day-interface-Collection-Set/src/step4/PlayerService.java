package step4;

public class PlayerService {
	public void executeAll(Player[] pa) {
		for(int i=0;i<pa.length;i++) {
			pa[i].play();
		}
	}
}
