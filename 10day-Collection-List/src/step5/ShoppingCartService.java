package step5;

import java.util.ArrayList;

public class ShoppingCartService {
	private ArrayList<Product> list = new ArrayList<Product>(); //return type, generic�� ����!
	private int count=0;
	
	public void addProduct(Product p) {
		list.add(count, p);
		count = count + 1;
	}
	
	public void printAll() {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //list.get(i) > ���� �ش� ��ü�� �ּҰ�..overriding �ʿ�! 
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
