package step1;

import java.util.Scanner;

public class TestSwitch1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����� �Է��ϼ���:");
		int grade = s.nextInt();
		
		//������ break�� ���ٸ� ���ǿ� �´� case �������� ���� �����Ѵ�.
		switch(grade) {
		case 1:
			System.out.println("This is one");
		case 2:
			System.out.println("This is two");
		default:
			System.out.println("This is three");
		}
		s.close(); //IO stream�� ���� in�� �Ͽ����� �ݵ�� out�� �Ѵ�.
	}
}
