package step1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ShoppingCartService {
	private LinkedHashMap<String, Product> map = new LinkedHashMap<String, Product>();
	
	public void addProduct(Product product) {
		map.put(product.getId(), product);
	}
	
	public void printAll() {
		Collection<Product> col = map.values();
		Iterator<Product> it = col.iterator();
		
		while(it.hasNext()) {
			Product p = it.next();
			System.out.println(p.getMaker() + p.getName());
		}
	}

	public Product findProductById(String id) {
		Product product = map.get(id);
		return product;	
	}

	public void deleteProductById(String id) {
		map.remove(id);
	}

	public int getTotalPrice() {
		int totalPrice = 0;
		
		Collection<Product> col = map.values();
		Iterator<Product> it = col.iterator();
		
		while(it.hasNext()) {
			Product p = it.next();
			totalPrice = totalPrice + p.getPrice();
		}
		
		return totalPrice;
	}
}
