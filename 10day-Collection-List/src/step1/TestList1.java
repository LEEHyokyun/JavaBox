package step1;

import java.util.ArrayList;

public class TestList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("치킨");
		list.add("맥주");
		list.add("스파게티");
		System.out.println(list); //list 출력, toString overrided.
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list.remove(1)); //해당 인덱스 value를 list에서 제거
		System.out.println(list);
		list.set(1, "소주");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.clear();
	}
}
