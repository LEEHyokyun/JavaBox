package stepA;

public class Coffee extends Drink{
	private String brand;
	public Coffee(String name, int price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	
	public String toString() {
		return super.toString()+" brand: "+brand;
	}
}
