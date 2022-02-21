package step1;

import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		CollectionService service = new CollectionService();
		Collection<String> col = service.findDataCollection("a");
		System.out.println(col.getClass().getName());
		//Collection 계열의 다양한 자료구조체(getClass-> class ArrayList or Set -> getName으로 반환받은 객체의 이름)
		Iterator<String> it = col.iterator();
		//1) Collection<String> datatype으로 ArrayList/LinkedList로 "객체화"
		//2) 객체화한 이후에, .iterator() 메소드를 통해 다시 객체화(interface<String>) -> iterator 관련 메소드 사용 가능
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
