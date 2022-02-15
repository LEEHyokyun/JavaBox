package step4;

public class ZooService3 {
	public void enter(Animal a) {
		
		if(a instanceof Person) {
			((Person) a).ticketing();
		}
		a.play();
	}
}
