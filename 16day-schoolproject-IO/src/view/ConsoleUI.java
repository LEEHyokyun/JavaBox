package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import model.DuplicateTelException;
import model.Employee;
import model.Member;
import model.MemberNotFoundException;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class ConsoleUI {
	private SchoolService service = new SchoolService();
	private Scanner s = new Scanner(System.in);
	
	public void execute() throws FileNotFoundException, IOException, ClassNotFoundException {
		exit: while (true) {
			System.out.println("******학사관리 프로그램을 시작합니다.******");
			System.out.println("1.추가 2.삭제 3.검색 4.전체회원보기 5.종료 6.파일 읽어오기");

			String input = s.nextLine();
			switch (input) {
			case "1":
				addView();
				break;
			case "2":
				deleteView();
				break;
			case "3":
				findView();
				break;
			case "4":
				System.out.println("******전체 리스트 출력합니다.******");
				service.printAll();
				break;
			case "5":
				System.out.println("******학사관리 프로그램을 종료합니다.******");
				service.saveData();
				System.out.println("******해당 객체가 파일로 저장되었습니다.******");
				break exit;
			case "6":
				System.out.println("******파일을 읽어옵니다.******");
				service.loadData();
			default:
				System.out.println("******잘못된 입력값입니다.******");
			}
		}
		s.close();
	}

	public void addView() {
		String type = null;
		while(true) {
			System.out.println("입력할 구성원의 종류를 선택하세요: 1.학생 2. 선생님 3.직원");
			type = s.nextLine();
			if(type.equals("1")||type.equals("2")||type.equals("3")) {
				break;
			}else {
				System.out.println("1.학생 2.선생님 3.직원 중 하나만 선택할 수 있습니다!");
				System.out.println(" ");
			}
		}
		
		String tel = null;
		while(true) {
			System.out.println("1. 전화번호를 입력하세요: ");
			tel = s.nextLine();
			try {
				service.findMemberByTel(tel);
				System.out.println("전화번호가 중복됩니다. 다시 입력하세요!");
			} catch (MemberNotFoundException e) {
				break;
			}
		}
		
		System.out.println("2. 이름을 입력하세요: ");
		String name = s.nextLine();
		System.out.println("3. 주소를 입력하세요: ");
		String address = s.nextLine();
		
		Member member = null;
		
		switch(type) {
		/*
		 * 다형성을 적용하여 객체를 생성한다.
		 */
		case "1" : 
			System.out.println("4. 학번을 입력하세요: ");
			String stuId = s.nextLine();
			member = new Student(tel, name, address, stuId);
			break; //switch문 탈출
		case "2" :
			System.out.println("4. 과목을 입력하세요: ");
			String subject = s.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3" : 
			System.out.println("4. 부서를 입력하세요: ");
			String department = s.nextLine();
			member = new Employee(tel, name, address, department);
			break;
		}
		
		try {
			service.addMember(member);
			System.out.println("정상적으로 리스트에 추가되습니다: "+member.toString());
		} catch (DuplicateTelException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteView() {
		System.out.println("삭제할 구성원의 전화번호를 입력하세요: ");
		String tel = s.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel+ "전화번호의 구성원을 삭제하였습니다.");
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void findView() {
		System.out.println("조회할 구성원의 전화번호를 입력하세요: ");
		String tel = s.nextLine();
		
		try {
			Member member = service.findMemberByTel(tel);
			System.out.println(member);
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
