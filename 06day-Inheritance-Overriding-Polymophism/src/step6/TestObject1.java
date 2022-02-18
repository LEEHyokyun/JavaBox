package step6;

import step5.Employee;

//super class of "Car" is "Object"
class Car{
	//extends Object
	//public Car(){super();}
	
}

public class TestObject1 {
	public static void main(String[] args) {
		Car c = new Car(); 
		//Car가 상속하는 Object class의 method 사용가능!
		//기본적으로 있어야 하는 "기능들"
		System.out.println(c.getClass()); //step6.Car
		//from object class method.
		//해당 객체가 어떤 class로부터 만들어졌는가(호출되었는가)
		
		Employee e = new Employee("1", "유재석", 300);
		System.out.println(e.getClass());
		
		//toString()
		//해당 객체의 주소값
		System.out.println(c.toString()); 
		System.out.println(c);
		//내부적으로 toString 호출하여 동일한 결과 도출
		System.out.println(e.toString());
		
	}
}
