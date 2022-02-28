package model;
// Service : business logic �� �����ϴ� Ŭ���� 

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
	// key : tel , value : Member( Student, Teacher, Employee ) 
	private LinkedHashMap<String, Member> map=new LinkedHashMap<String, Member>();
	public void addMember(Member member) throws DuplicateTelException {
		//map�� ����� �������� tel -> key �� �Ű������� ���޵� �������� tel �� ���� ���� �����ϴ���
		if(map.containsKey(member.getTel())) {//�����ϸ� true
			throw new DuplicateTelException(member.getTel()+" tel�� �����Ͽ� ��ϺҰ��մϴ�");// ���� �߻� 
		}
		map.put(member.getTel(), member);
	}
	public void printAll() {
		//map�� values �� ������ ������ ��� ��� 
		Collection<Member> col=map.values();//key�� ������ value�鸸 ��ȯ 
		Iterator<Member> it=col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false) {//tel�� �ش��ϴ� key�� map�� �������� ������  
			throw new MemberNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ �����ϴ�");
		}
		return map.get(tel);
	}
	public Member deleteMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false) {//tel�� �ش��ϴ� key�� map�� �������� ������ 
			throw new MemberNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ ��� �����Ұ�!");
		}
		//map���� tel�� ��ġ�ϴ� key�� value �� ������������ ���� �� ������ ������ ������ ��ȯ 
		return map.remove(tel);
	}
	public void updateMember(Member member) throws MemberNotFoundException {
		if(map.containsKey(member.getTel())==false) {//tel�� �ش��ϴ� key�� map�� �������� ������ 
			throw new MemberNotFoundException(member.getTel()
					+" tel�� �ش��ϴ� ������ ������ ��� �����Ұ�!");
		}
		// put() : ������ key�� ������ value�� ������Ʈ , ������ �߰��� �� 	
		map.put(member.getTel(), member);
	}
}






















