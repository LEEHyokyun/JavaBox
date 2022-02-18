package step8;

import java.util.LinkedHashSet;

public class TestSet1 {
	public static void main(String[] args) {
		// <E> : Generic 요소의 type을 지정
		// Set array의 요소 type을 string으로 지정
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("박보검");
		set.add("아이유");
		set.add("박보검");
		System.out.println(set);
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		//generic in detail
		
		LinkedHashSet set2 = new LinkedHashSet();
		set2.add("Hello");
		//generic 안쓸수도 있지만, 쓰는 것을 권장한다.
		//generic을 기재하지 않는다면 다른 type의 데이터 저장 가능
		
		LinkedHashSet<Integer> set3 = new LinkedHashSet<Integer>();
		set3.add(3);
		System.out.println(set3);
		System.out.println(set3.size());
		System.out.println(set3.isEmpty());
		//generic = Integer
	}
}
