package model;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Member> list = new ArrayList<Member>();
	
	public void addMember(Member member) {
		boolean exist = false;
		for(int i=0;i<list.size();i++) {
			if(member.getTel().equals(list.get(i).getTel())) {
				exist = true;
				break;
			}
		}
		if(exist==false) {
			list.add(member);
		}
	}
	
	public void printAll() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public Member findMemberByTel(String tel) {
		Member member = null;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTel().equals(tel)) {
				member = list.get(i);
				break;
			}
		}
		
		return member;
	}
	
	public String deleteMemberByTel(String tel) {
		String message = null;
		//01012341234 tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				message = list.remove(i).toString();
				break;
			}
		}
		// tel:0101231237 name:�輱�� address:ȭ�� department:�繫��
		if(message == null) {
			return tel + "�� �ش��ϴ� ������ ������ ��� ���� �Ұ�";
		}else {
			return message;
		}
	}
	
}
