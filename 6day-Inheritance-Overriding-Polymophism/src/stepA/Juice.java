package stepA;

public class Juice extends Drink{
	private String juiceFlavor;

	public Juice(String waterType, int waterAmount, String juiceFlavor) {
		super(waterType, waterAmount);
		this.juiceFlavor = juiceFlavor;
	}
	
	public void printJuice() {
		System.out.println("쥬스를 마시다");
	}
	
	public String getDetails() {
		return super.getDetails() +" "+juiceFlavor+"향이 나는 쥬스를 마셨습니다.";
	}
}
