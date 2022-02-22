package step3;

import java.util.Scanner;

public class TestException7 {
	public static void main(String[] args) {
		/*
		 * Scanner s = new Scanner(System.in); //�Է� s.close(); //Scanner ����� close, IO
		 * Stream ���� ���������� ����������.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		String info = s.nextLine(); // �� ���ξ� ���� �Է�
		try{
			int age = Integer.parseInt(info);
			if (age > 19) {
				System.out.println("����� �����Դϴ�");
			} else {
				System.out.println("����� �̼����Դϴ�");

			}
		}catch(NumberFormatException e) {
			System.out.println(e);
		}finally {
			s.close();
		}
	}
}
