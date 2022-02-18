package step7;

import step4.Monkey;
import step4.Person;
import step4.Animal;

public class TestPolymorphism8 {
	public static void main(String[] args) {
		ZooService4 service = new ZooService4();
		
		Animal[] a = {new Monkey(), new Person()};
		service.playAll(a);
	}
}
