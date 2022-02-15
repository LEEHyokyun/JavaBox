package stepA;

public class StudyPolymorphism {
	public static void main(String[] args) {
		
		BuyService service = new BuyService();
		
		service.printBuyDetail(new Drink("ź���", 1500));
		service.printBuyDetail(new Coffee("�Ƹ޸�ī��",4000,"��Ÿ����"));
		service.printBuyDetail(new Alcohol("����",1800,17));
		
		System.out.println("-----------------------");
		
		int length = 5;
		BuyResourceService service2 = new BuyResourceService(length);
		service2.add(new Drink("ź���", 1500));
		service2.add(new Coffee("�Ƹ޸�ī��",4000,"��Ÿ����"));
		service2.add(new Alcohol("����",1800,17));
		
		service2.printAll();
	}
}
