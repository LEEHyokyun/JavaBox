package step3;

public class Person {
	public void eat() {
		System.out.println("먹다");
	}

	public void eat(String menu) {
		System.out.println(menu + "을(를) 먹다");
	}

	public void eat(String menu, int count) {
		System.out.println(menu + "을(를) " + count + "인분 먹다");
	}

	public void eat(int count, String menu) {
		System.out.println(menu + "을(를) " + count + "인분 먹다");
	}

	// 단축키 참고!
	// ctrl + shift + / : 주석
	// ctrl + shift + \ : 주석해제
	// ctrl + shift + f : 코드정리(indent 등)
	// ctrl + shift + o : import
}
