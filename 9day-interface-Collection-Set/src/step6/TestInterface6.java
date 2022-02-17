package step6;

public class TestInterface6 {
	public static void main(String[] args) {
		//interface down casting
		PlayerService service = new PlayerService();
		service.proceed(new Youtube());
		service.proceed(new CDPlayer());
		/*
		 * down casting -> print all methods in their objects.
		 */
	}
}
