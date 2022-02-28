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
			System.out.println("******�л���� ���α׷��� �����մϴ�.******");
			System.out.println("1.�߰� 2.���� 3.�˻� 4.��üȸ������ 5.���� 6.���� �о����");

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
				System.out.println("******��ü ����Ʈ ����մϴ�.******");
				service.printAll();
				break;
			case "5":
				System.out.println("******�л���� ���α׷��� �����մϴ�.******");
				service.saveData();
				System.out.println("******�ش� ��ü�� ���Ϸ� ����Ǿ����ϴ�.******");
				break exit;
			case "6":
				System.out.println("******������ �о�ɴϴ�.******");
				service.loadData();
			default:
				System.out.println("******�߸��� �Է°��Դϴ�.******");
			}
		}
		s.close();
	}

	public void addView() {
		String type = null;
		while(true) {
			System.out.println("�Է��� �������� ������ �����ϼ���: 1.�л� 2. ������ 3.����");
			type = s.nextLine();
			if(type.equals("1")||type.equals("2")||type.equals("3")) {
				break;
			}else {
				System.out.println("1.�л� 2.������ 3.���� �� �ϳ��� ������ �� �ֽ��ϴ�!");
				System.out.println(" ");
			}
		}
		
		String tel = null;
		while(true) {
			System.out.println("1. ��ȭ��ȣ�� �Է��ϼ���: ");
			tel = s.nextLine();
			try {
				service.findMemberByTel(tel);
				System.out.println("��ȭ��ȣ�� �ߺ��˴ϴ�. �ٽ� �Է��ϼ���!");
			} catch (MemberNotFoundException e) {
				break;
			}
		}
		
		System.out.println("2. �̸��� �Է��ϼ���: ");
		String name = s.nextLine();
		System.out.println("3. �ּҸ� �Է��ϼ���: ");
		String address = s.nextLine();
		
		Member member = null;
		
		switch(type) {
		/*
		 * �������� �����Ͽ� ��ü�� �����Ѵ�.
		 */
		case "1" : 
			System.out.println("4. �й��� �Է��ϼ���: ");
			String stuId = s.nextLine();
			member = new Student(tel, name, address, stuId);
			break; //switch�� Ż��
		case "2" :
			System.out.println("4. ������ �Է��ϼ���: ");
			String subject = s.nextLine();
			member = new Teacher(tel, name, address, subject);
			break;
		case "3" : 
			System.out.println("4. �μ��� �Է��ϼ���: ");
			String department = s.nextLine();
			member = new Employee(tel, name, address, department);
			break;
		}
		
		try {
			service.addMember(member);
			System.out.println("���������� ����Ʈ�� �߰��ǽ��ϴ�: "+member.toString());
		} catch (DuplicateTelException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteView() {
		System.out.println("������ �������� ��ȭ��ȣ�� �Է��ϼ���: ");
		String tel = s.nextLine();
		try {
			service.deleteMemberByTel(tel);
			System.out.println(tel+ "��ȭ��ȣ�� �������� �����Ͽ����ϴ�.");
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void findView() {
		System.out.println("��ȸ�� �������� ��ȭ��ȣ�� �Է��ϼ���: ");
		String tel = s.nextLine();
		
		try {
			Member member = service.findMemberByTel(tel);
			System.out.println(member);
		} catch (MemberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
