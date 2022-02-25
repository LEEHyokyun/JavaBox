package step1;

public class TestReviewStringAndStringBuilder {
	public static void main(String[] args) {
		
		/*
		 * String constant : ºÒº¯
		 */
		
		String s1 = "¼ÕÈï¹Î"; //String constant pool in heap
		String s2 = "¼ÕÈï¹Î"; //String constant pool in heap
		System.out.println(s1.concat("¼±¼ö"));
		System.out.println(s1);
		
		/*
		 * haep : °¡º¯
		 */
		
		StringBuilder sb = new StringBuilder("ÀÌ½Â¿ì");
		System.out.println(sb);
		System.out.println(sb.append("¼±¼ö"));
		System.out.println(sb);
		
		String name1 = "È²ÀÇÁ¶";
		StringBuilder sb2 = new StringBuilder("È²ÀÇÁ¶");
		
		System.out.println(name1.equals(sb2.toString()));
		System.out.println(name1.contentEquals(sb2));
	}
}
