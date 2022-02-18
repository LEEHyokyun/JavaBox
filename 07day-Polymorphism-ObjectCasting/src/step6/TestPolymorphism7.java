package step6;
//Polymorphism to "array"
class Car{};
class Animal{};
class Person extends Animal{};
class Dog extends Animal{};

public class TestPolymorphism7 {
	public static void main(String[] args) {
		Car[] carArray = {new Car(), new Car()};
		//could not be new Animal()
		Animal[] aniArray = {new Dog(), new Person()};
		//polymorphism .. �θ� type�� ���ؼ��� �ڽİ�ü �迭 ��������
		System.out.println(aniArray[0]);
		System.out.println(aniArray[1]);
	}
}
