package step1;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ġŲ");
		list.add("����");
		list.add("���İ�Ƽ");
		System.out.println(list); //list ���, toString overrided.
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list.remove(1)); //�ش� �ε��� value�� list���� ����
		System.out.println(list);
		list.set(1, "����");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.clear();
	}
}
