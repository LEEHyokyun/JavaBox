package step3;
//abstract class
abstract class Person{
	int age = 2;
	Person(){
		System.out.println("Person ��ü ����");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
}

class Student extends Person{
		
	Student(){
		super(); //Person �����ڸ� �����Ͽ� Person��ü�� ������
		System.out.println("Student ��ü ����");
	}
	
	public void eat() {
		System.out.println("�Ծ��!");
	}
}

public class TestAbstract1 {
	public static void main(String[] args) {
		//Person p = new Person(); //abstract�� "new"�� ���� ��ü�����Ұ�
		Student s = new Student();
		//�θ�Ÿ������ ���� ����
		s.eat(); 
		s.age = 5;
	}
}

