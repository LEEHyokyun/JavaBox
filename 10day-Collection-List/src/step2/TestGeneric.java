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
		//권장하지는 않는다.
		ArrayList<Animal> list2 = new ArrayList<Animal>();
		list2.add(new Person());
		list2.add(new Dog());
		//list2.add(new Car()); 계층구조가 아닌 객체이므로 인자전달불가
	}
}
