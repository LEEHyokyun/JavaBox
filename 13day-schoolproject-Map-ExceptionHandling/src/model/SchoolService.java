package model;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

//for BusinessLogic

public class SchoolService {
	private LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();
	//key - tel, value - member
	
	public void addMember(Member member) throws DuplicateTelException{
		if(map.containsKey(member.getTel())) {
			throw new DuplicateTelException(member.getTel()+"�� ���� ��ȣ�� �ߺ��Ǿ� ��������� �Ұ����մϴ�.");
		}
		map.put(member.getTel(), member);
	}
	
	public void printAll() {
		Collection<Member> col = map.values(); 
		//map value(Member ��ü)�� ���� Collection ����ü ����(Collection iterator method ���)
		//value, �ٱ��Ͽ� ���� ��ҵ鿡 ���� ��ȯ�ϵ� Collection<generic> datatype, ��ҵ��� ��üȭ
		Iterator it = col.iterator();
		//Collection type -> Iterator type
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public Member findMemberByTel(String tel) throws MemberNotFoundException{
		if(!map.containsKey(tel)) {
			throw new MemberNotFoundException(tel+"�� �ش��ϴ� ������ ������ �����ϴ�.");
		}
		return map.get(tel);
	}

	public Member deleteMemberByTel(String tel) throws MemberNotFoundException{
		if(!map.containsKey(tel)) {
			throw new MemberNotFoundException(tel+"�� �ش��ϴ� ������ ������ �����ϴ�.");
		}
		Member member = map.remove(tel);
		return member;
	}

	public void updateMember(Member m) throws MemberNotFoundException{
		if(!map.containsKey(m.getTel())) {
			throw new MemberNotFoundException(m.getTel()+"�� �ش��ϴ� ������ ������ �����ϴ�.");
		}
		map.put(m.getTel(), m);
	}
}
