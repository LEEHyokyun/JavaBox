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
		//polymorphism .. 부모 type에 대해서는 자식객체 배열 생성가능
		System.out.println(aniArray[0]);
		System.out.println(aniArray[1]);
	}
}
