package step5;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput {
	public static void main(String[] args) {
		InputStream is = System.in;
		//console���� �Է��� �޴� InputStream
		//�ܼ���ġ�� ����� 'nodestream'
		Scanner sc = new Scanner(is);
		//sc.close(); //node stream�� ����� processing stream ����!
		
		String name = sc.nextLine();	 //�� ���ξ� �Է�
		sc.close(); 
	}
}
