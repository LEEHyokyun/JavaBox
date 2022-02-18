package step3;

import java.util.ArrayList;

public class TestGeneric2 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Friend("아이유", 30));
		//index 0의 요소로 접근하여 해당 객체의 name 가져오기
		//list.get(0).getName(); 
		//불가, upcasting이 되어있는 상태이므로
		//즉, Object type에 자식객체가 할당된 upcasting 상태
		//다시 말해(지금까지 이해한 그대로임), Object를 바라보는 상태
		/*
		 * 따라서 해당 객체에 접근하기 위해서는 자체적인 object down casting이 필요하다. 
		 */
		//((Friend) list.get(0)).getName(); 
		//or
		//Object o = list.get(0);
		//o.getName();
		
		ArrayList<Friend> list2 = new ArrayList<Friend>();
		//generic을 할 경우 overcasting X .. 바로 해당 객체접근가능
		
	}
}
