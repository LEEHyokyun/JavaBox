package step6;

public class TestMethod2 {
	public static void main(String[] args) {
		//Friend 객체 생성
		Friend f = new Friend();
		//메서드 호출
		f.eat();
		//인자를 전달
		f.eat2("피자");
		f.eat3("김밥", 3);
		
		String returnValue = f.eat4();
		System.out.println(returnValue);
	}
}
