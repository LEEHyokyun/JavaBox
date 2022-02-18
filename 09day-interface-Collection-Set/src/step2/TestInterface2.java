package step2;

import step1.Flyer;
import step1.AirPlane;
import step1.Bird;
//SuperMan class is in various hierarchy

public class TestInterface2 {
	public static void main(String[] args) {
		Flyer f1 = new SuperMan();
		f1.fly();
		Fighter f2 = new SuperMan();
		f2.fight();
		
		//인터페이스 객체도 생성가능!
		Flyer[] fa = {new AirPlane(), new Bird(), new SuperMan()};
		
		for(int i=0;i<fa.length;i++) {
			fa[i].fly();
		}
	}
}
