package step6;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("±è°¡³×");
		System.out.println(sb);
		System.out.println(sb.append("±è¹ä"));
		System.out.println(sb.substring(1,4));
		System.out.println(sb.insert(2,"³ª"));
		System.out.println(sb.delete(1,2));
		
		StringBuilder sb2 = new StringBuilder("ÇÏ³ªµÑ¼Â³Ý´Ù¼¸");
		sb2.reverse();
	}
}
