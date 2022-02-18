package step5;

public class TestShoppingCart {
	public static void main(String[] args) {
		ShoppingCartService service = new ShoppingCartService();
		service.addProduct(new Product("진라면", "오뚜기", 1200));
		service.addProduct(new Product("군만두","해태",3000));
		service.addProduct(new Product("짜파게티","농심", 1500));
		service.printAll();
		
		int totalPrice = service.getTotalPrice();
		System.out.println("장바구니 상품 총액: "+totalPrice);
	}
}
