package stepA;

public class Coffee extends Drink{
	private String coffeeStore;
	
	public Coffee(String coffeeType, int coffeeAmount, String coffeeStore) {
		super(coffeeType, coffeeAmount);
		this.coffeeStore = coffeeStore;
	}
	
	public void printCoffee() {
		System.out.println("커피를 마시다");
	}
	
	public String getDetails() {
		return super.getDetails() +" "+coffeeStore+"에서 마셨습니다.";
	}
}
