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
