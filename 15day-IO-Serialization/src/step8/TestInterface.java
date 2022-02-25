package step8;

interface Flyer {
}

class Bird implements Flyer {

}

class Eagle extends Bird {
}

public class TestInterface {
/*
 * Eagle -> Bird -> Flyer
 */
	public static void main(String[] args) {
		Flyer f1 = new Bird(); //OK
		Flyer f2 = new Eagle();
		/*
		 * 동일 계층구조에 있다면 instanceof 자신클래스 혹은 Datatype(부모클래스 혹은 인터페이스) 모두 가능
		 */
		System.out.println(f1 instanceof Flyer);
		System.out.println(f2 instanceof Flyer);
		//만약 상위계층에서 implement 하였다면
		//자식 클래스에서는 별도로 implement할 필요가 없다.
		//즉 java.io.serialzable interface imple하면, 자식 클래스는 별도로 imple 할 필요가 없다.
		
		/*
		 *  정리 - 부모가 interface를 imple한다면, 이를 상속받은 자식이 또 imple할 필요는 없다.
		 *  serializable interface를 imple한 부모를 자식이 상속받을 경우,
		 *  직렬화 가능한 특성을 자식이 그대로 물려받고, 이를 직렬화할 수 있다.
		 */
	}
}
