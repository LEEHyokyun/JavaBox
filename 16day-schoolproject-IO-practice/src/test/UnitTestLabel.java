package test;

import java.util.Scanner;

public class UnitTestLabel {
	public static void main(String[] args) {
		// ������� label ��� ����
		Scanner s = new Scanner(System.in);
		exit: // label -> break ���̺���� ����ϸ� �Ʒ��� while���� ��� �� �ִ� 
		while(true) {
			System.out.print("1.���  2.����");
			String info=s.nextLine();
			switch(info) {
			case "1":
				System.out.println("����۾�����");
				break;//���� switch ���� ����� 
			case "2":
				System.out.println("����");
				//while ���� ������� �Ѵٸ� label�� �̿��Ѵ� 
				break exit;
			}
		}		
		s.close();
	}
}
