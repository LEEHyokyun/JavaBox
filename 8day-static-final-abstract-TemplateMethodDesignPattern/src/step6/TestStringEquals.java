package step6;

public class TestStringEquals {
	public static void main(String[] args) {
		String s1 = "������";
		String s2 = "������";
		String s3 = new String("������");
		StringBuilder s4 = new StringBuilder("������");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4.toString()));
	}
}
