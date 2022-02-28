package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

//for BusinessLogic

public class SchoolService {
	private String path = "C:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"school"+File.separator+"member-list.obj";
	
	public void saveData() throws FileNotFoundException, IOException {
		File dir = new File(path).getParentFile(); //school directroy
		if(!dir.isDirectory()) {
			dir.mkdirs();
		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		
		try{
			oos.writeObject(map);
		}finally {
			if(oos != null) oos.close();
		}
	}
	
	public void loadData() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File(path);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		if(file.isFile()) {
			try {
				Object obj = (LinkedHashMap<String, Member>) ois.readObject();
			}finally {
				if(ois != null) ois.close();
			}
		}
	}
	
	private LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();
	//key - tel, value - member
	public void addMember(Member member) throws DuplicateTelException{
		if(map.containsKey(member.getTel())) {
			throw new DuplicateTelException(member.getTel()+"에 대한 번호가 중복되어 정보등록이 불가능합니다.");
		}
		map.put(member.getTel(), member);
	}
	
	public void printAll() {
		Collection<Member> col = map.values(); 
		//map value(Member 객체)를 통해 Collection 구현체 생성(Collection iterator method 사용)
		//value, 바구니에 담을 요소들에 대해 반환하되 Collection<generic> datatype, 요소들을 객체화
		Iterator it = col.iterator();
		//Collection type -> Iterator type
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public Member findMemberByTel(String tel) throws MemberNotFoundException{
		if(!map.containsKey(tel)) {
			throw new MemberNotFoundException(tel+"에 해당하는 구성원 정보가 없습니다.");
		}
		return map.get(tel);
	}

	public Member deleteMemberByTel(String tel) throws MemberNotFoundException{
		if(!map.containsKey(tel)) {
			throw new MemberNotFoundException(tel+"에 해당하는 구성원 정보가 없습니다.");
		}
		Member member = map.remove(tel);
		return member;
	}

	public void updateMember(Member m) throws MemberNotFoundException{
		if(!map.containsKey(m.getTel())) {
			throw new MemberNotFoundException(m.getTel()+"에 해당하는 구성원 정보가 없습니다.");
		}
		map.put(m.getTel(), m);
	}
}
