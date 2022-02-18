package stepA;

public class BuyService {
	public void printBuyDetail(Drink d) {
		if(d instanceof Alcohol) {
			System.out.println("신분증을 보여주세요");
		}
		System.out.println(d);
	}
}
