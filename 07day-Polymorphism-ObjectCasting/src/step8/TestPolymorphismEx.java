package step8;

import step5.*;

public class TestPolymorphismEx {
	public static void main(String[] args) {
		//service area
		int length=10;
		//�������ʱ�ȭ�� ���� service �ν��Ͻ� ������ index 10���� �迭�� ����
		HumanResourceService service = new HumanResourceService();
		
		service.add(new Manager("1","������",600,"�������"));
		service.add(new Employee("2","���ϴ�",700));
		service.add(new Engineer("3","�ں���",700,"�ڹ�"));
		service.printAll();
		/*
		 * empNo, empName, salary printall
		 */
		
	}
}
