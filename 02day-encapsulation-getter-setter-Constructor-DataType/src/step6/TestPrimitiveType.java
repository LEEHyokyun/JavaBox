package step6;

public class TestPrimitiveType {
	public static void main(String[] args) {
		//정수형 byte
		byte by = 1;
		System.out.println(by);
		
		//Java SE API를 활용하여 byte형의 최대값
		//API는 static으로 객체 생성없이 바로 사용가능
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		//정수형 short
		short s = 128;
		System.out.println(s);
		
		//정수형 int
		int s2 = 128;
		System.out.println(s2);
		
		System.out.println(Integer.MAX_VALUE);
		
		//int 형 범위를 벗어날 경우엔 끝에 long type, 끝에 L 덧붙힘
		long j = 21456779100L;
		
		//실수형 double
		double f = 3.14; //8byte
		float f2 = 3.14F; //4byte
		
		//문자형 - 한문자만 할당 가능(한글)
		char ch ='밥';
		System.out.println(ch);
		
		//논리형 - 참 or 거짓
		boolean t = true;
	}
}
