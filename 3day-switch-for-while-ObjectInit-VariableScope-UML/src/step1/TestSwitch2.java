package step1;

import java.util.Scanner;

public class TestSwitch2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����� �Է��ϼ���:");
		int grade = s.nextInt();
		
		//������ break�� ���ٸ� ���ǿ� �´� case ������ �����Ѵ�.
		//Ż���� ���ؼ��� �ݵ�� break �ۼ� �ʿ�.
		switch(grade) {
		case 1:
			System.out.println("This is one");
			break;
		case 2:
			System.out.println("This is two");
			break;
		case 3: case 4: case 5: //���� ��츦 �� �ٿ� �ۼ� ����
			System.out.println("This is three, four, five");
			break;
		default:
			System.out.println("This is another case");
		}
		s.close(); //IO stream�� ���� in�� �Ͽ����� �ݵ�� out�� �Ѵ�.
	}
}
