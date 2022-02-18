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
}
