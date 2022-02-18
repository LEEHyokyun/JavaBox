package step8;

import step5.*;

public class TestPolymorphismEx {
	public static void main(String[] args) {
		//service area
		int length=10;
		//생성자초기화를 통해 service 인스턴스 변수로 index 10개의 배열이 생성
		HumanResourceService service = new HumanResourceService();
		
		service.add(new Manager("1","아이유",600,"기술영업"));
		service.add(new Employee("2","강하늘",700));
		service.add(new Engineer("3","박보검",700,"자바"));
		service.printAll();
		/*
		 * empNo, empName, salary printall
		 */
		
	}
}
