package step2;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class TestMap2 {
	public static void main(String[] args) {
		TreeMap<Integer, Food> map = new TreeMap<Integer, Food>();
		map.put(2,  new Food(2,"ī��",1440));
		map.put(3, new Food(3,"�������",1500));
		map.put(1, new Food(1, "��߸�", 900));
		System.out.println(map);
		//Treemap�� �ڵ�����.. key���� �ڵ������� ���ĵǾ� return �ȴ�.
		//System.out.println(map.get(1).getName());
		Collection<Food> col = map.values();
		Iterator<Food> it = col.iterator(); //Collection type -> iterator method and returned iterator implementation.
		
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}
}