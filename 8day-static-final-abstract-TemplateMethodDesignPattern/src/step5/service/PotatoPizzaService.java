package step5.service;

import step5.common.PizzaService;

public class PotatoPizzaService extends PizzaService{
	//�θ��� abstract method�� implementation, ��üȭ
	@Override //������̼�, ������ �� ����� ������ �ִ� �ּ�
				//�����Ͻ� �������̵� ������ üũ
	public void topping() {
		System.out.println("���ڸ� �����Ͽ����ϴ�(abstract method ��üȭ)");
	}
}
