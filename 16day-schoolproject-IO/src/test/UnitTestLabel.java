package test;

import java.util.Scanner;

public class UnitTestLabel {
	// label in condition or loop
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		exit: // break ���̺���� ����ϸ� while �� Ż���� �����ϴ�.
		while (true) {
			System.out.println("1.��� 2.����");
			String info = s.nextLine();
			switch (info) {
			case "1":
				System.out.println("���");
				break;
			case "2":
				System.out.println("����");
				break exit; //switch escape
				//while���� ������� �Ѵٸ� label �̿�
			}
		}
		s.close();
	}
}
