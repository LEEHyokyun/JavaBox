package stepA;

public class StudyPolymorphism {
	public static void main(String[] args) {
		
		BuyService service = new BuyService();
		
		service.printBuyDetail(new Drink("탄산수", 1500));
		service.printBuyDetail(new Coffee("아메리카노",4000,"스타벅스"));
		service.printBuyDetail(new Alcohol("소주",1800,17));
		
		System.out.println("-----------------------");
		
		int length = 5;
		BuyResourceService service2 = new BuyResourceService(length);
		service2.add(new Drink("탄산수", 1500));
		service2.add(new Coffee("아메리카노",4000,"스타벅스"));
		service2.add(new Alcohol("소주",1800,17));
		
		service2.printAll();
	}
}
