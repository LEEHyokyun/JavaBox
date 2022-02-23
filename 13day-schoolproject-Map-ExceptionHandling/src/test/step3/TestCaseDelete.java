package test.step3;

import model.DuplicateTelException;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseDelete {
	public static void main(String[] args) {
		SchoolService service=new SchoolService();
		try {
			service.addMember(new Student("011","아이유","종로","21"));
			System.out.println("등록 ok");
		}catch(DuplicateTelException de) {//기존 tel이 존재하면 
			System.out.println(de.getMessage());//011 tel 중복되어 등록불가합니다!
		}
		try {
			service.addMember(new Teacher("016","RM","강남","수학"));
			System.out.println("등록 ok");
		}catch(DuplicateTelException de) {//기존 tel이 존재하면 
			System.out.println(de.getMessage());//016 tel 중복되어 등록불가합니다!
		}			
		service.printAll(); // 두 명의 상세정보 ( toString() ) 가 출력되어야 한다	
		System.out.println("****구성원 삭제테스트 시작****");
		try {
			String	tel="011";//정상흐름 			 
			Member mem=service.deleteMemberByTel(tel);
			System.out.println("삭제완료 삭제정보:"+mem);//삭제완료 삭제정보: tel:011 name:아이유 address:종로  stuNo:21
			service.printAll();//삭제 되었으므로 1명만 출력 
		}catch(MemberNotFoundException me) {
			System.out.println(me.getMessage());
		}
		try {
			String	tel="018";//정상흐름 
			tel="018";//예외흐름 
			Member mem=service.deleteMemberByTel(tel);
			System.out.println("삭제완료 삭제정보:"+mem);
			service.printAll();
		}catch(MemberNotFoundException me) {
			System.out.println(me.getMessage());//018 tel에 해당하는 구성원 정보가 없어서 삭제불가! 			
		}
		System.out.println("****구성원 삭제테스트 완료****");
	}//main
}//class




























