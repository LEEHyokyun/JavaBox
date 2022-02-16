package step5.service;

import step5.common.PizzaService;

public class PotatoPizzaService extends PizzaService{
	//부모의 abstract method를 implementation, 구체화
	@Override //어노테이션, 컴파일 및 실행시 영향을 주는 주석
				//컴파일시 오버라이드 문법을 체크
	public void topping() {
		System.out.println("감자를 토핑하였습니다(abstract method 구체화)");
	}
}
