package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionService {
	public Collection<String> findDataCollection(String type){
		Collection<String> col = null;
		//���� Collection �ڷᱸ�� interface�� �������ְ�,
		//���޹޴� type�� ���� Collection ���� ����ü�� ���� �ٸ��� �����Ѵ�.
		if(type.equalsIgnoreCase("A")) {
			//type A : �����ϴ� ���� ����ü�� ArrayList, �̿� ���õ� �޼ҵ�
			col = new ArrayList<String>();
			col.add("����");
			col.add("����");
			col.add("����");
		}else {
			// another : �����ϴ� ���� ����ü�� Set, �̿� ���õ� �޼ҵ�
			col = new LinkedList<String>();
			col.add("������");
			col.add("������");
		}
		return col;
	}
}
