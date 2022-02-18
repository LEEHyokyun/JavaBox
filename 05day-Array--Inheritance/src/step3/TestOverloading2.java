package step3;

public class TestOverloading2 {
	public static void main(String[] args) {
		//Constructor overloading
		//말 그대로 매개변수에 따라 여러개의 생성자 생성 가능
		KostaMember m = new KostaMember();
		KostaMember m2 = new KostaMember("java");
		//KostaMember m3 = new KostaMember("java", "아이유");
	}
}
