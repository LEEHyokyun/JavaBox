package step3;

public class TestComposition {
	public static void main(String[] args) {
		// composition
		// Engine consists of Car.
		Car c = new Car("grandeur");
		System.out.println(c.getModel());
	
		//c 객체가 참조하는 Car 객체의 엔진 type을 반환받아 출력한다.
		System.out.println(c.getEngine().getType());
		
		//c 객체가 참조하는 Car 객체의 엔진 배기량을 3000으로 변경
		c.getEngine().setDisplacement(3000);
		// ㄴ c 객체(Car)의 참조변수 engine이 실질적으로 Engine 객체를 참조(그 주소값)하므로 가능한 과정이다!!
		System.out.println(c.getEngine().getDisplacement());
		
		/*
		 * 1. Car datatype의 c 객체 생성
		 * 2. c 객체 생성자가 생성되면서 model과, 내부적으로 engine 객체생성자까지 호출
		 * 3. 생성자가 dataType이 Engine, Engine dataType class를 그대로 생성하고
		 * 4. 내부적인 engine 참조변수가 이(객체의 주소값) 참조하게 되면 그때 Car 생성자(즉 객체) 생성완료
		 * 5. 그 객체를 Car가 가르키게 된 상태에서 car 객체까지 생성완료됨
		 */
		
		//정리) 객체생성순서 : Engine > Car
	}
}
