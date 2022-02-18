package step5.common;

public abstract class PizzaService {
	//첫번째 common 구성
	//상속받은 자식에 한해서만 사용할 수 있도록 protected 제한자 구성
	protected void prepare() {
		System.out.println("도우를 만들었습니다");
	}
	protected abstract void topping(); //해당 기능은 자식 클래스에서 구현 
	//맞춤형 구현 필요!
	protected void bake() {
		System.out.println("피자를 구웠습니다");
	}
	protected void cutting() {
		System.out.println("피자를 잘랐습니다");
	}
	protected void boxing() {
		System.out.println("완성한 피자를 포장하였습니다");
	}
	//template method!
	public void makePizza() {
		//실질적으로 사용하기 위한 "대표" "일괄화된" method
		prepare();
		topping();
		bake();
		cutting();
		boxing();
	}
}
