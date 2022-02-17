package step3;

import step1.Flyer;

//service
public class FlyerService {
	public void proceed(Flyer f) { //datatype: interface
		//called only interface's method!
		f.fly();
	}
}
