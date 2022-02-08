package step2;

public class TestSetterGetter {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setModel("Grandeur");
		System.out.println(c.getModel());
		
		c.setPrice(3000);
		System.out.println(c.getPrice());
	}
}
