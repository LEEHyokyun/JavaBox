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
		//Car�� ����ϴ� Object class�� method ��밡��!
		//�⺻������ �־�� �ϴ� "��ɵ�"
		System.out.println(c.getClass()); //step6.Car
		//from object class method.
		//�ش� ��ü�� � class�κ��� ��������°�(ȣ��Ǿ��°�)
		
		Employee e = new Employee("1", "���缮", 300);
		System.out.println(e.getClass());
		
		//toString()
		//�ش� ��ü�� �ּҰ�
		System.out.println(c.toString()); 
		System.out.println(c);
		//���������� toString ȣ���Ͽ� ������ ��� ����
		System.out.println(e.toString());
		
	}
}
