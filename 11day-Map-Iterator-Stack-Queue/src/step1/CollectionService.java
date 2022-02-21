package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionService {
	public Collection<String> findDataCollection(String type){
		Collection<String> col = null;
		//먼저 Collection 자료구조 interface를 선언해주고,
		//전달받는 type에 따라 Collection 하위 구조체를 각각 다르게 구성한다.
		if(type.equalsIgnoreCase("A")) {
			//type A : 구현하는 하위 구조체는 ArrayList, 이와 관련된 메소드
			col = new ArrayList<String>();
			col.add("피자");
			col.add("맥주");
			col.add("족발");
		}else {
			// another : 구현하는 하위 구조체는 Set, 이와 관련된 메소드
			col = new LinkedList<String>();
			col.add("아이폰");
			col.add("갤럭시");
		}
		return col;
	}
}
