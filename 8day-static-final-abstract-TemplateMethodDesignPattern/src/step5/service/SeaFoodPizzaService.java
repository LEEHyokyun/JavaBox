package step5.service;

import step5.common.PizzaService;

public class SeaFoodPizzaService extends PizzaService{
	
	@Override
	public void topping() {
		System.out.println("�ػ깰�� �����Ͽ����ϴ�(abstract method ��üȭ)");
	}
}
