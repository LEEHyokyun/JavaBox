package step4;

import java.util.ArrayList;
import step3.Friend;

public class TestList2 {
	public static void main(String[] args) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		
		list.add(new Friend("������", 500));
		list.add(new Friend("���ϴ�", 300));
		list.add(new Friend("�ں���", 400));
		//for loop�� �̿��� Name ���!
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
		
		System.out.println("**************");
		int num = 400;
		//for loop, list ����� num 400������ ��� ���
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getMoney() <= 400) {
				System.out.println(list.get(i).getName());
			}
		}
		
	System.out.println("******************");
	String name = "������";
	//for loop �̿��ؼ� list ��� �� name �������� �ش��ϴ� ����� ģ���� money ���
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.println(list.get(i).getMoney());
			}
		}
		System.out.println("************");
		System.out.println(list.get(0).toString());
		//toString override ... ���� ��ü ������ ��ȯ�Ǿ� ���
	}
}
