package step5;

import java.util.Scanner;

public class TestConsoleInput2 {
	/*
	 * �����ϴ� ���ø��� �Է��ϼ���: ���� 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("�����ϴ� ���ø��� �Է��ϼ���: ");
			String city = s.nextLine();
			System.out.println("�����ϴ� ���ø�: "+city);
			if(city.equals("����")) break;
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		s.close();
	}
}
