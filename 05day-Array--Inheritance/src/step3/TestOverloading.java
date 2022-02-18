package step3;

public class TestOverloading {
	public static void main(String[] args) {
		//Method overloading
		//동일한 메소드 명으로 다양한 매개변수를 정의하여 사용
		Person p = new Person();
		p.eat();
		p.eat("떡볶이");
		//매개변수 순서가 달라진다면 메소드 오버로딩 가능
		//단 변수명은 고려사항X
		p.eat("떡볶이", 3);
		p.eat(3, "떡볶이");
	}
}
