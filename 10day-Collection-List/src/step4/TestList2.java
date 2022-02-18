package step4;

import java.util.ArrayList;
import step3.Friend;

public class TestList2 {
	public static void main(String[] args) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		
		list.add(new Friend("아이유", 500));
		list.add(new Friend("강하늘", 300));
		list.add(new Friend("박보검", 400));
		//for loop를 이용한 Name 출력!
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
		
		System.out.println("**************");
		int num = 400;
		//for loop, list 요소중 num 400이하의 요소 출력
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getMoney() <= 400) {
				System.out.println(list.get(i).getName());
			}
		}
		
	System.out.println("******************");
	String name = "아이유";
	//for loop 이용해서 list 요소 중 name 아이유에 해당하는 요소의 친구의 money 출력
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.println(list.get(i).getMoney());
			}
		}
		System.out.println("************");
		System.out.println(list.get(0).toString());
		//toString override ... 실제 객체 정보가 반환되어 출력
	}
}
