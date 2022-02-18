package test.step3;

import model.Employee;
import test.step3.SchoolService;
import model.Student;
import model.Teacher;

public class TestCaseDelete {
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
		String tel="0101231230";//�������� �ʴ� ��ȣ�� �׽�Ʈ 
		System.out.println("����:"+service.deleteMemberByTel(tel));//01012341234 tel�� �ش��ϴ� ������ ������ ��� ���� �Ұ�
		tel="0101231237";//�����ϴ� ��ȣ�� �׽�Ʈ 
		System.out.println("����:"+service.deleteMemberByTel(tel));// tel:0101231237 name:�輱�� address:ȭ�� department:�繫��
		System.out.println("***��ü ������ ����Ʈ ���***");
		service.printAll();//5���� ������ ��� 
		System.out.println("***�б� ������ ���� �׽�Ʈ �Ϸ�***");
	}
}











