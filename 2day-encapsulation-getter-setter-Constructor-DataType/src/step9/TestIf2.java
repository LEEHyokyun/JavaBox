package step9;

import java.util.Scanner;

public class TestIf2 {
	//�����(client) side
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�¾ ���� �Է��ϼ���");
		System.out.println(s.nextInt());
		//�Է� �� �⺻�� ������ ����
		int m = s.nextInt();
		Mydate d = new Mydate(m);
		
		int month = d.getMonth();
		
		if(month != -1) { //-1�� �ƴ϶�� �Ʒ� ������ ����ȴ�.
		System.out.println("����� "+month+"���� �¾���ϴ�.");
		}
		
		s.close();
	}
}
