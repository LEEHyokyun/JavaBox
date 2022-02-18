package step9;
//������ ����� 
class Product{}
class Food extends Product{}
class Computer extends Product{}

class MarketService{
	//���� - �� ��ü datatype���� method ����...���յ��� ��������.
	//public void buy(Food f)
	//public void buy(Computer c)
	
	//������, �������� ����Ǵ� �������� �ϳ��� �޼ҵ�� ���� ���� ����.
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
		 * Product(�θ�) �迭�� �ڽ� ��ü�� �پ��ϰ� �����Ѵٰ� �� ��
		 * 
		 */
	}
}
