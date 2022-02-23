package step7;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String name = "아이유";
		System.out.println(name);
		System.out.println(name.concat("짱"));
		System.out.println(name); //String은 상수영역 .. 새로운 문자열을 생성
		String name2 = "아이유";
		/*
		 * 동일한 문자열 상수 영역에서 생성된 문자열 "아이유"를
		 * 각기 다른 name, name2 (stack)이 이를 참조하는 방식이다(=공유)
		 */
		
		StringBuilder sb = new StringBuilder("박보검");
		System.out.println(sb.append("군")); //가변, 원본자체가 변경
	}
}
