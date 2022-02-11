package step9;
/*
 *  how to object be created.
 */

//no access modifier in one class file
//class A is the highest super class of those,
//A class calls java.lang.object class in java sys.

class A{ //���� ���߿� ȣ��, ���� ���� ��ü ����
	/*
	 * A extends Object
	 */
	A(){
		System.out.println("A ��ü ����");
	}
}

class B extends A{  //B sub, A super
	B(){ //super(); -> A������ ȣ��(������� �ʾ����� �ڵ�)
		System.out.println("B ��ü ����");
	}
}

class C extends B{ //C sub, B super
	C(){ //super(); -> B ������ ȣ��(������� �ʾ����� �ڵ�)
		System.out.println("C ��ü ����");
	}
}

//finally the latest created class would be C.
//Object > A > B > C

public class TestSuper3 {
	public static void main(String[] args) {
		new C();
	}
}

