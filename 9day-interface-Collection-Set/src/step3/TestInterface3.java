package step3;

import step1.Bird;
import step1.AirPlane;
import step2.SuperMan;

//main, user
public class TestInterface3 {
	public static void main(String[] args) {
		FlyerService service = new FlyerService();
		service.proceed(new Bird());
		service.proceed(new AirPlane());
		service.proceed(new SuperMan());
	}
}
