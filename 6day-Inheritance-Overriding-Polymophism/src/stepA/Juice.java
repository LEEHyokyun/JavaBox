package stepA;

public class Juice extends Drink{
	private String juiceFlavor;

	public Juice(String waterType, int waterAmount, String juiceFlavor) {
		super(waterType, waterAmount);
		this.juiceFlavor = juiceFlavor;
	}
	
	public void printJuice() {
		System.out.println("�꽺�� ���ô�");
	}
	
	public String getDetails() {
		return super.getDetails() +" "+juiceFlavor+"���� ���� �꽺�� ���̽��ϴ�.";
	}
}
