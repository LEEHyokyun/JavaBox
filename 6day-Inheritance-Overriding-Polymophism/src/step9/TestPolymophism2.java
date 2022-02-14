package step9;
//다형성 적용시 
class Product{}
class Food extends Product{}
class Computer extends Product{}

class MarketService{
	//기존 - 각 객체 datatype마다 method 정의...결합도가 높아진다.
	//public void buy(Food f)
	//public void buy(Computer c)
	
	//개선후, 다형성이 적용되는 형식으로 하나의 메소드로 통합 정의 가능.
	public void buy(Product p) {
		System.out.println(p.getClass().getName());
	}
}

public class TestPolymophism2 {
	public static void main(String[] args) {
		MarketService service = new MarketService();
		
		service.buy(new Food());
		service.buy(new Computer());
		//service.buy(new Phone());
		/*
		 * Product(부모) 계열의 자식 객체가 다양하게 존재한다고 할 때
		 * 
		 */
	}
}
