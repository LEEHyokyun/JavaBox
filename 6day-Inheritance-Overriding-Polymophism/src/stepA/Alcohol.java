package stepA;

public class Alcohol extends Drink{
	private int degree;

	public Alcohol(String waterType, int waterAmount, int degree) {
		super(waterType, waterAmount);
		this.degree = degree;
		// TODO Auto-generated constructor stub
	}
	
	public void printAlcohol() {
		System.out.println("���� ���ô�");
	}
	
	public String getDetails() {
		return super.getDetails() +" "+degree+"������ ���� ���̽��ϴ�.";
	}
}
