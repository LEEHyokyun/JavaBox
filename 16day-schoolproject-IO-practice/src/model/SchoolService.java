package model;
// Service : business logic 을 정의하는 클래스 

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
	// key : tel , value : Member( Student, Teacher, Employee ) 
	private LinkedHashMap<String, Member> map=new LinkedHashMap<String, Member>();
	public void addMember(Member member) throws DuplicateTelException {
		//map에 저장된 구성원의 tel -> key 가 매개변수로 전달된 구성원의 tel 과 같은 것이 존재하는지
		if(map.containsKey(member.getTel())) {//존재하면 true
			throw new DuplicateTelException(member.getTel()+" tel이 존재하여 등록불가합니다");// 예외 발생 
		}
		map.put(member.getTel(), member);
	}
	public void printAll() {
		//map의 values 즉 구성원 정보를 모두 출력 
		Collection<Member> col=map.values();//key를 제외한 value들만 반환 
		Iterator<Member> it=col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public Member findMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false) {//tel에 해당하는 key가 map에 존재하지 않으면  
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없습니다");
		}
		return map.get(tel);
	}
	public Member deleteMemberByTel(String tel) throws MemberNotFoundException {
		if(map.containsKey(tel)==false) {//tel에 해당하는 key가 map에 존재하지 않으면 
			throw new MemberNotFoundException(tel+" tel에 해당하는 구성원 정보가 없어서 삭제불가!");
		}
		//map에서 tel에 일치하는 key의 value 즉 구성원정보를 삭제 후 삭제한 구성원 정보를 반환 
		return map.remove(tel);
	}
	public void updateMember(Member member) throws MemberNotFoundException {
		if(map.containsKey(member.getTel())==false) {//tel에 해당하는 key가 map에 존재하지 않으면 
			throw new MemberNotFoundException(member.getTel()
					+" tel에 해당하는 구성원 정보가 없어서 수정불가!");
		}
		// put() : 동일한 key가 있으면 value가 업데이트 , 없으면 추가가 됨 	
		map.put(member.getTel(), member);
	}
}






















