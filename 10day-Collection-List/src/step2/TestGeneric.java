package step2;

import java.util.ArrayList;

//about generic

class Animal{}
class Person extends Animal{}
class Dog extends Animal{}
class Car{}

public class TestGeneric {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Animal());
		list.add(new Person());
		list.add(new Dog());
		//all of object types could be added.
		//���������� �ʴ´�.
		ArrayList<Animal> list2 = new ArrayList<Animal>();
		list2.add(new Person());
		list2.add(new Dog());
		//list2.add(new Car()); ���������� �ƴ� ��ü�̹Ƿ� �������޺Ұ�
	}
}
