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
	 * findIndexByTel를 재사용하여 코드를 간결화한다.
	 */
	public void addMember(Member member) {
		int index = findIndexByTel(member.getTel());
		
		if(index<0) {
			list.add(member);
		}else {
			System.out.println("해당 구성원의 정보는 이미 저장되어 있습니다.");
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
		//01012341234 tel에 해당하는 구성원 정보가 없어서 삭제 불가
		// tel:0101231237 name:김선제 address:화성 department:재무부
		if(index < 0) {
			return tel + "에 해당하는 구성원 정보가 없어서 삭제 불가";
		}else {
			return list.remove(index).toString();
		}
	}

	public String updateMember(Member member) {
		String message = null;
		String tel = member.getTel();
		int index = findIndexByTel(tel);
		
		if(index < 0) {
			message = "수정이 불가능 합니다";
		}else {
			String msgbuffer = list.set(index, member).toString();
			message = msgbuffer+"의 구성원 정보가 다음과 같이 수정되었습니다: "+member.toString();
		}
		
		return message;
	}
	
}
