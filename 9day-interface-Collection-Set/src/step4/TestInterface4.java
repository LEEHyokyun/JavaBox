package step4;

public class TestInterface4 {
	public static void main(String[] args) {
		PlayerService service = new PlayerService();
		Player[] pa = {
				new Youtube(), new CDPlayer(), new LPPlayer()
				};
		service.executeAll(pa); //service : 객체를 받아 전체를 실행
	}
}
