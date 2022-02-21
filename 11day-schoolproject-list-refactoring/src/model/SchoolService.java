package model;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Member> list = new ArrayList<Member>();
	
	public int findIndexByTel(String tel) {
		int index = -1;
		
		for(int i=0;i<list.size();i++) {
			if(tel.equals(list.get(i).getTel())) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/*
	 * findIndexByTel�� �����Ͽ� �ڵ带 ����ȭ�Ѵ�.
	 */
	public void addMember(Member member) {
		int index = findIndexByTel(member.getTel());
		
		if(index<0) {
			list.add(member);
		}else {
			System.out.println("�ش� �������� ������ �̹� ����Ǿ� �ֽ��ϴ�.");
		}
	}
	
	public void printAll() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public Member findMemberByTel(String tel) {
		int index = findIndexByTel(tel);
		Member member;
		
		if(index <0) {
			member = null;
			return member;
		}else {
			member = list.get(index);
			return member;
		}
	}
	
	public String deleteMemberByTel(String tel) {
		int index = findIndexByTel(tel);
		//01012341234 tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�
		// tel:0101231237 name:�輱�� address:ȭ�� department:�繫��
		if(index < 0) {
			return tel + "�� �ش��ϴ� ������ ������ ��� ���� �Ұ�";
		}else {
			return list.remove(index).toString();
		}
	}

	public String updateMember(Member member) {
		String message = null;
		String tel = member.getTel();
		int index = findIndexByTel(tel);
		
		if(index < 0) {
			message = "������ �Ұ��� �մϴ�";
		}else {
			String msgbuffer = list.set(index, member).toString();
			message = msgbuffer+"�� ������ ������ ������ ���� �����Ǿ����ϴ�: "+member.toString();
		}
		
		return message;
	}
	
}
