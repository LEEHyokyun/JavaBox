package model;

import java.util.ArrayList;

//refactoring SchoolService
public class SchoolServiceVer2 {
	private ArrayList<Member> list = new ArrayList<Member>();
	
	public void addMember(Member member) {
		list.add(member);
	}
	public void printAll() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
