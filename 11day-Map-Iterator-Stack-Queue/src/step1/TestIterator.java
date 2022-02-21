package step1;

import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		CollectionService service = new CollectionService();
		Collection<String> col = service.findDataCollection("a");
		System.out.println(col.getClass().getName());
		//Collection �迭�� �پ��� �ڷᱸ��ü(getClass-> class ArrayList or Set -> getName���� ��ȯ���� ��ü�� �̸�)
		Iterator<String> it = col.iterator();
		//1) Collection<String> datatype���� ArrayList/LinkedList�� "��üȭ"
		//2) ��üȭ�� ���Ŀ�, .iterator() �޼ҵ带 ���� �ٽ� ��üȭ(interface<String>) -> iterator ���� �޼ҵ� ��� ����
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
