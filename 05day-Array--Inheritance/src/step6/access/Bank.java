package step6.access;

public class Bank {
	public void publicTest() {
		System.out.println("publicTest method");
	}

	protected void protectedTest() {
		System.out.println("Protected method");
	}

	void defaultTest() {
		System.out.println("default method");
	}

	private void privateTest() {
		System.out.println("private method");
	}
}
