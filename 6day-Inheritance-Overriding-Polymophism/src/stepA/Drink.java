package stepA;

public class Drink {
	private String drinkType;
	private int drinkAmount;
	
	public Drink(String drinkType, int drinkAmount) {
		this.drinkType = drinkType;
		this.drinkAmount = drinkAmount;
	}
	
	public void printDrink() {
		System.out.println("print drink");
	}
	
	public String getDetails() {
		return drinkType+" �� �����ͼ� "+drinkAmount+" ��ŭ ";
	}
}
