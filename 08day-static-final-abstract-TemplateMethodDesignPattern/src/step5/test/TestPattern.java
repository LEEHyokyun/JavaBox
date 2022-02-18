package step5.test;

import step5.common.PizzaService;
import step5.service.PotatoPizzaService;
import step5.service.SeaFoodPizzaService;

//abstract class�� �θ��ҿ� �����Ѵ�.
public class TestPattern {
	public static void main(String[] args) {
		//parent data type����, �������� ������ "�迭��" �����Ͽ� ���!
		PizzaService[] array  = {
				new PotatoPizzaService(),
				new SeaFoodPizzaService()
		};
		//���������� ����ϴ� method�� makePizza!
		for(int i=0;i<array.length;i++) {
			array[i].makePizza();
			System.out.println("***************");
		}
	}
}
