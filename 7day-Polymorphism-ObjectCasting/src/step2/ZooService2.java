package step2;

import step1.Animal;
import step1.Dog;

public class ZooService2 {
	public void pass(Animal a) {
		if(a instanceof Dog){
			System.out.println("Dog instance�� ȣ��Ǿ����ϴ�.");
			a.eat();
			System.out.println(a instanceof Animal);
		}
	}
}
