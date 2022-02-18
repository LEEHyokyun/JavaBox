package step6;

public class TestStringEquals {
	public static void main(String[] args) {
		String s1 = "아이유";
		String s2 = "아이유";
		String s3 = new String("아이유");
		StringBuilder s4 = new StringBuilder("아이유");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4.toString()));
	}
}
