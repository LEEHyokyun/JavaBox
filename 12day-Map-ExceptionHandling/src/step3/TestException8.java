package step3;

import java.util.ArrayList;

public class TestException8 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("�����");
		list.add("������");
		try {
			list.get(2);
			System.out.println("a");
		}catch(NullPointerException e) {
			System.out.println("b");
		}finally {
			System.out.println("c");
		}
		/*
		 * IndexOutOfBoundException ó���� ���� �ʾұ� ������
		 * main ������ ������� �ʴ´�.
		 */
		System.out.println("d");
	}
}
