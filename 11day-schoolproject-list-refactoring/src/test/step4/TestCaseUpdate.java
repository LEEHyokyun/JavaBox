package test.step4;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseUpdate {
	public static void main(String[] args) {
		SchoolService service = new SchoolService();
		service.addMember(new Student("0101231234", "���±�", "����", "17"));
		service.addMember(new Teacher("0101231235", "������", "����", "����"));
		service.addMember(new Student("0101231236", "������", "����", "16"));
		service.addMember(new Employee("0101231237", "�輱��", "ȭ��", "�繫��"));
		service.addMember(new Student("0101231238", "��¹�", "����", "18"));
		service.addMember(new Teacher("0101231239", "������", "����", "����"));
		service.printAll();//6���� ������ ��� 
		System.out.println("***�б� ������ ��� �Ϸ�***");
		//ȸ�� ������ �����ϴ� ����� �׽�Ʈ
		String message = service.updateMember(new Student("0101231239","������","����","22"));
		System.out.println(message);
		service.printAll(); //������Ʈ ���� Ȯ��
		String message2 = service.updateMember(new Student("0101234321","�ں���","����","17"));
		System.out.println(message2);
		/*
		 * list �� ������ tel�� �����Ѵٸ� ������ ��ü ������ update
		 * tel�� �������� �ʴ´ٸ� ���� �Ұ�
		 */
	}
}












