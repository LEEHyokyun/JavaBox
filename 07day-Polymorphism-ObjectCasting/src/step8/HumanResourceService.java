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
		//dataType = �θ�
		eArray[count] = e; //�״�� �Ҵ�.
		count = count + 1; //�ν��Ͻ������� ��ȭ..���������� �ƴ�.
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
			System.out.println(eArray[i]); //�� ��ü�� toString ȣ��
		}
	}
}
