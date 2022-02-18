package step8;

import step5.*;

public class HumanResourceService {
	private Employee[] eArray;
	int count = 0;
	
	//public HumanResourceService(int length) {
		//eArray = new Employee[length];
	//}
	/*
	 //if using loop condition
	public void add(Employee e) {
		for(int i=0; i<eArray.length;i++) {
			if(eArray[i] == null) {
				eArray[i] = e;
				break;
			}
			
		}
	}
	*/
	public void add(Employee e) {
		//dataType = 부모
		eArray[count] = e; //그대로 할당.
		count = count + 1; //인스턴스변수가 변화..지역변수가 아님.
	}
	
	/*
	 //if using loop condition
	public void printAll() {
		for(int i=0;i<eArray.length;i++) {
			if(eArray[i] != null) {
				System.out.println(eArray[i]);
			}
		}
	}
	*/
	
	public void printAll() {
		for(int i=0;i<count;i++) {
			System.out.println(eArray[i]); //각 객체의 toString 호출
		}
	}
}
