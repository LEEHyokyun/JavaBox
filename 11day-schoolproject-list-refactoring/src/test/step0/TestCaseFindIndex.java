package test.step0;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

//refactoring
public class TestCaseFindIndex {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		
		service.addMember(new Student("0101231234", "강승규", "용인", "17"));
		service.addMember(new Teacher("0101231235", "구병수", "수지", "국어"));
		service.addMember(new Student("0101231236", "구자형", "수원", "16"));
		service.addMember(new Employee("0101231237", "김선제", "화성", "재무부"));
		service.addMember(new Student("0101231238", "김승배", "용인", "18"));
		service.addMember(new Teacher("0101231239", "심지훈", "용인", "수학"));
		service.printAll();
		System.out.println("***************findIndexByTel()***************");
		String tel = "0101231239";
		int position = service.findIndexByTel(tel);
		System.out.println("position: "+position);
		tel = "1111111";
		int position2 = service.findIndexByTel(tel);
		System.out.println("position: "+position2);
	}
}
