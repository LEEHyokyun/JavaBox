package step8;

import java.util.TreeSet;

public class TestSet2 {
	public static void main(String[] args) {
		//TreeSet: �ߺ�����X, ���ı���� ����Ǿ��ִ�.
		TreeSet<String> set1 = new TreeSet<String>();// ���ڿ����
		set1.add("a");
		set1.add("b");
		set1.add("a"); //�ߺ�����
		System.out.println(set1.size());
		System.out.println(set1); //���ı��
	}
}
