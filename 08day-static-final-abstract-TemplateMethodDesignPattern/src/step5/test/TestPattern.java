package step5.test;

import step5.common.PizzaService;
import step5.service.PotatoPizzaService;
import step5.service.SeaFoodPizzaService;

//abstract class는 부모역할에 집중한다.
public class TestPattern {
	public static void main(String[] args) {
		//parent data type으로, 다형성을 적용한 "배열로" 선언하여 사용!
		PizzaService[] array  = {
				new PotatoPizzaService(),
				new SeaFoodPizzaService()
		};
		//실질적으로 사용하는 method는 makePizza!
		for(int i=0;i<array.length;i++) {
			array[i].makePizza();
			System.out.println("***************");
		}
	}
}
