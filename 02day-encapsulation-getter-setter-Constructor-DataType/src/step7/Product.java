package step7;

public class Product {
	private String name; //�ν��Ͻ� �������� ������ type
	private String maker; 
	private int price; //�ν��Ͻ� �������� �⺻�� type
	
	public Product(String name, String maker, int price) {
		//��ü�� ����� �������� �⺻���� ������ ����
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
