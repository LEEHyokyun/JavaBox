package step7;

public class Product {
	private String name; //인스턴스 변수이자 참조형 type
	private String maker; 
	private int price; //인스턴스 변수이자 기본형 type
	
	public Product(String name, String maker, int price) {
		//객체를 만드는 시점에서 기본적인 변수를 설정
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
