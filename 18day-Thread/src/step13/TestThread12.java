package step13;

public class TestThread12 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread t1 = new Thread(toilet, "박보검");
		t1.start();
		Thread t2 = new Thread(toilet, "강하늘");
		t2.start();
	}
}
