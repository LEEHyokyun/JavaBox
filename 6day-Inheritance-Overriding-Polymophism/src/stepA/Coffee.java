package stepA;

public class Coffee extends Drink{
	private String coffeeStore;
	
	public Coffee(String coffeeType, int coffeeAmount, String coffeeStore) {
		super(coffeeType, coffeeAmount);
		this.coffeeStore = coffeeStore;
	}
	
	public void printCoffee() {
		System.out.println("Ŀ�Ǹ� ���ô�");
	}
	
	public String getDetails() {
		return super.getDetails() +" "+coffeeStore+"���� ���̽��ϴ�.";
	}
}
