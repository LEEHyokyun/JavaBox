package step1;

public class TestReviewStringAndStringBuilder {
	public static void main(String[] args) {
		
		/*
		 * String constant : �Һ�
		 */
		
		String s1 = "�����"; //String constant pool in heap
		String s2 = "�����"; //String constant pool in heap
		System.out.println(s1.concat("����"));
		System.out.println(s1);
		
		/*
		 * haep : ����
		 */
		
		StringBuilder sb = new StringBuilder("�̽¿�");
		System.out.println(sb);
		System.out.println(sb.append("����"));
		System.out.println(sb);
		
		String name1 = "Ȳ����";
		StringBuilder sb2 = new StringBuilder("Ȳ����");
		
		System.out.println(name1.equals(sb2.toString()));
		System.out.println(name1.contentEquals(sb2));
	}
}
