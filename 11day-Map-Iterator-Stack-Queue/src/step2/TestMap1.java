package step2;

import java.util.LinkedHashMap;

public class TestMap1 {
	public static void main(String[] args) {
		Food f1 = new Food(1, "테라", 4000);
		Food f2 = new Food(2, "진라면", 1100);
		Food f3 = new Food(3, "고향만두", 5000);
		
		LinkedHashMap<Integer, Food> map = new LinkedHashMap<Integer, Food>();
		//LinkedHashMap은 구현체 type
		//generic : key type, value type으로 각각 이루어진다.
		map.put(f1.getId(), f1);
		map.put(f2.getId(), f2);
		
		//search
		map.get(1);
		System.out.println(map.get(2));
		
		System.out.println(map.put(2, new Food(2, "신라면", 1500)));
	}
}
