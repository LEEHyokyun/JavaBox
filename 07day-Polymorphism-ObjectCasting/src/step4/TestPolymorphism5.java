package step4;
/*
 *  다형성 적용 매개변수
 *  instance of 
 *  Object casting
 */
public class TestPolymorphism5 {
	public static void main(String[] args) {
		ZooService3 service = new ZooService3();
		service.enter(new Tiger());
		service.enter(new Monkey());
		service.enter(new Person());
	}
}
