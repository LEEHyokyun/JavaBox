package step8;

import java.util.LinkedHashSet;

public class TestSet1 {
	public static void main(String[] args) {
		// <E> : Generic ����� type�� ����
		// Set array�� ��� type�� string���� ����
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("�ں���");
		set.add("������");
		set.add("�ں���");
		System.out.println(set);
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		//generic in detail
		
		LinkedHashSet set2 = new LinkedHashSet();
		set2.add("Hello");
		//generic �Ⱦ����� ������, ���� ���� �����Ѵ�.
		//generic�� �������� �ʴ´ٸ� �ٸ� type�� ������ ���� ����
		
		LinkedHashSet<Integer> set3 = new LinkedHashSet<Integer>();
		set3.add(3);
		System.out.println(set3);
		System.out.println(set3.size());
		System.out.println(set3.isEmpty());
		//generic = Integer
	}
}
