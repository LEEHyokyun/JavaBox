package step3;

import java.util.ArrayList;

public class TestGeneric2 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Friend("������", 30));
		//index 0�� ��ҷ� �����Ͽ� �ش� ��ü�� name ��������
		//list.get(0).getName(); 
		//�Ұ�, upcasting�� �Ǿ��ִ� �����̹Ƿ�
		//��, Object type�� �ڽİ�ü�� �Ҵ�� upcasting ����
		//�ٽ� ����(���ݱ��� ������ �״����), Object�� �ٶ󺸴� ����
		/*
		 * ���� �ش� ��ü�� �����ϱ� ���ؼ��� ��ü���� object down casting�� �ʿ��ϴ�. 
		 */
		//((Friend) list.get(0)).getName(); 
		//or
		//Object o = list.get(0);
		//o.getName();
		
		ArrayList<Friend> list2 = new ArrayList<Friend>();
		//generic�� �� ��� overcasting X .. �ٷ� �ش� ��ü���ٰ���
		
	}
}
