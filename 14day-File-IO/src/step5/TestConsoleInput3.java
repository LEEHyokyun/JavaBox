package step5;

import java.util.Scanner;

public class TestConsoleInput3 {
	/*
	 * �����ϴ� ���ø��� �Է��ϼ���: ���� 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*while(true) {
			System.out.println("�����ϴ� ���ø��� �Է��ϼ���: ");
			String city = s.nextLine();
			System.out.println("�����ϴ� ���ø�: "+city);
			if(city.equals("����")) break;
		}
		s.close();
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}*/
		String city = null;
		do {
			System.out.println("�����ϴ� ���ø��� �Է��ϼ���: ");
			city = s.nextLine();
			System.out.println("�����ϴ� ���ø�: "+city);
		}while(!city.equals("����"));
			s.close();
			
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}
}
