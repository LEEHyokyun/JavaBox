package step6;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("�谡��");
		System.out.println(sb);
		System.out.println(sb.append("���"));
		System.out.println(sb.substring(1,4));
		System.out.println(sb.insert(2,"��"));
		System.out.println(sb.delete(1,2));
		
		StringBuilder sb2 = new StringBuilder("�ϳ��Ѽ³ݴټ�");
		sb2.reverse();
	}
}
