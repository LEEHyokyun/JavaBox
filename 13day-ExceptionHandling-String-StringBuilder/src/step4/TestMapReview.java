package step4;

import java.util.LinkedHashMap;

public class TestMapReview {
	public static void main(String[] args) {
		LinkedHashMap<String, Friend> map = new LinkedHashMap<String, Friend>();
		
		Friend f1 = new Friend("æ∆¿Ã¿Ø", 30);
		map.put(f1.getName(), f1);
		
		map.put("rm", new Friend("rm",29));
		
		System.out.println(map);
		
		System.out.println(map.get(f1.getName()));
		System.out.println(map.containsKey("rm"));
		
		//delete
		System.out.println(map.remove("rm"));
	}
}
