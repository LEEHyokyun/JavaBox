package step6;

public class TestPrimitiveType {
	public static void main(String[] args) {
		//������ byte
		byte by = 1;
		System.out.println(by);
		
		//Java SE API�� Ȱ���Ͽ� byte���� �ִ밪
		//API�� static���� ��ü �������� �ٷ� ��밡��
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		//������ short
		short s = 128;
		System.out.println(s);
		
		//������ int
		int s2 = 128;
		System.out.println(s2);
		
		System.out.println(Integer.MAX_VALUE);
		
		//int �� ������ ��� ��쿣 ���� long type, ���� L ������
		long j = 21456779100L;
		
		//�Ǽ��� double
		double f = 3.14; //8byte
		float f2 = 3.14F; //4byte
		
		//������ - �ѹ��ڸ� �Ҵ� ����(�ѱ�)
		char ch ='��';
		System.out.println(ch);
		
		//���� - �� or ����
		boolean t = true;
	}
}
