package stepA;

public class BuyService {
	public void printBuyDetail(Drink d) {
		if(d instanceof Alcohol) {
			System.out.println("�ź����� �����ּ���");
		}
		System.out.println(d);
	}
}
