package stepA;

public class Alcohol extends Drink{
	private int degree;
	public Alcohol(String name, int price, int degree) {
		super(name, price);
		this.degree = degree;
	}
	
	public String toString() {
		return super.toString() + " alcoholicity: "+degree +"%";
	}
}
