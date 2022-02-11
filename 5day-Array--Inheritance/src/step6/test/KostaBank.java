package step6.test;

import step6.access.Bank;

public class KostaBank extends Bank{
	public void accessTest() {
		//기본적으로 상속받았고, public method이므로 바로 사용가능
		publicTest();
		//protected이므로 다른 패키지이지만 상속받았으므로 사용가능
		protectedTest();
		//default,private 사용불가
		//defaultTest(); //다른 패키지에서 접근 불가
		//privateTest(); //자신의 클래스 내에서만 사용가능
	}
}
