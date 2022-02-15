package stepA;

public class Drink {
	private String name;
	private int price;
	
	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "name: "+name+" "+"price: "+price;
	}
}
