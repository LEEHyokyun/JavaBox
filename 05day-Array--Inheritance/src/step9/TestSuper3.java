package step9;
/*
 *  how to object be created.
 */

//no access modifier in one class file
//class A is the highest super class of those,
//A class calls java.lang.object class in java sys.

class A{ //가장 나중에 호출, 가장 먼저 객체 생성
	/*
	 * A extends Object
	 */
	A(){
		System.out.println("A 객체 생성");
	}
}

class B extends A{  //B sub, A super
	B(){ //super(); -> A생성자 호출(명기하지 않았지만 자동)
		System.out.println("B 객체 생성");
	}
}

class C extends B{ //C sub, B super
	C(){ //super(); -> B 생성자 호출(명기하지 않았지만 자동)
		System.out.println("C 객체 생성");
	}
}

//finally the latest created class would be C.
//Object > A > B > C

public class TestSuper3 {
	public static void main(String[] args) {
		new C();
	}
}

