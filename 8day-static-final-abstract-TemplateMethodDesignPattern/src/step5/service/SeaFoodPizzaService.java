package step5.service;

import step5.common.PizzaService;

public class SeaFoodPizzaService extends PizzaService{
	
	@Override
	public void topping() {
		System.out.println("해산물을 토핑하였습니다(abstract method 구체화)");
	}
}
