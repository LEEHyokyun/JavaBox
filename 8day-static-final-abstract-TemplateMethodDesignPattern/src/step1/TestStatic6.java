package step1;

public class TestStatic6 {
	public static void main(String[] args) {
		//java se api에서 자체적으로 제공하는 static member
		System.out.println(Short.MAX_VALUE);
		//Short class에서 정의된 static method
		String s1 = "2";
		String s2 = "8";
		System.out.println(s1+s2);
		
		//Integer class에서 정의된 static method
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		System.out.println(i+j);
	}
}
