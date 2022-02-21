package test.step4;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseUpdate {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addMember(new Student("0101231234", "강승규", "용인", "17"));
		service.addMember(new Teacher("0101231235", "구병수", "수지", "국어"));
		service.addMember(new Student("0101231236", "구자형", "수원", "16"));
		service.addMember(new Employee("0101231237", "김선제", "화성", "재무부"));
		service.addMember(new Student("0101231238", "김승배", "용인", "18"));
		service.addMember(new Teacher("0101231239", "심지훈", "용인", "수학"));
		service.printAll();//6명의 정보가 출력 
		System.out.println("***학교 구성원 등록 완료***");
		//회원 정보를 수정하는 기능을 테스트
		String message = service.updateMember(new Student("0101231239","아이유","서울","22"));
		System.out.println(message);
		service.printAll(); //업데이트 여부 확인
		String message2 = service.updateMember(new Student("0101234321","박보검","용인","17"));
		System.out.println(message2);
		/*
		 * list 내 동일한 tel이 존재한다면 전달한 객체 정보로 update
		 * tel이 존재하지 않는다면 수정 불가
		 */
	}
}












