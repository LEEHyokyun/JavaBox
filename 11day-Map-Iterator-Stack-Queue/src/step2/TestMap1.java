package step2;

import java.util.LinkedHashMap;

public class TestMap1 {
	public static void main(String[] args) {
		Food f1 = new Food(1, "�׶�", 4000);
		Food f2 = new Food(2, "�����", 1100);
		Food f3 = new Food(3, "���⸸��", 5000);
		
		LinkedHashMap<Integer, Food> map = new LinkedHashMap<Integer, Food>();
		//LinkedHashMap�� ����ü type
		//generic : key type, value type���� ���� �̷������.
		map.put(f1.getId(), f1);
		map.put(f2.getId(), f2);
		
		//search
		map.get(1);
		System.out.println(map.get(2));
		
		System.out.println(map.put(2, new Food(2, "�Ŷ��", 1500)));
	}
}
