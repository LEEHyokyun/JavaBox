package step9;

import java.util.Scanner;

public class TestIf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int age = s.nextInt();
		if(age == 19) {
			System.out.println(age);
		}s.close();
	}
	
}
