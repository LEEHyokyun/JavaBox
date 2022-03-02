package step07;

public class TestThread7 {
	public static void main(String[] args) {
		Word word = new Word();
		Thread thread = new Thread(word);
		thread.start();
	}
}
