package step5;

import java.util.ArrayList;

public class ShoppingCartService {
	private ArrayList<Product> list = new ArrayList<Product>(); //return type, generic만 정의!
	private int count=0;
	
	public void addProduct(Product p) {
		list.add(count, p);
		count = count + 1;
	}
	
	public void printAll() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //list.get(i) > 원래 해당 객체의 주소값..overriding 필요! 
		}
	}

	public int getTotalPrice() {
		int totalPrice = 0;
		for(int i=0;i<list.size();i++) {
			totalPrice = totalPrice + list.get(i).getPrice();
		}
		return totalPrice;
	}
}
