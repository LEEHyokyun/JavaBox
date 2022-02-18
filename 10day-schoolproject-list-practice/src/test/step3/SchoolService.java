package test.step3;

import java.util.ArrayList;

import model.Member;
import model.Student;

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

		public String deleteMemberByTel(String tel) {
			String message = null;
			//01012341234 tel에 해당하는 구성원 정보가 없어서 삭제 불가
			for(int i=0;i<list.size();i++) {
				if(tel.equals(list.get(i).getTel())) {
					message = list.remove(i).toString();
					break;
				}
			}
			// tel:0101231237 name:김선제 address:화성 department:재무부
			if(message == null) {
				return tel + "에 해당하는 구성원 정보가 없어서 삭제 불가";
			}else {
				return message;
			}
}
		
		
}
