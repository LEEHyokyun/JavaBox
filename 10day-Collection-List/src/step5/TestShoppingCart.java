package step5;

public class TestShoppingCart {
	public static void main(String[] args) {
		ShoppingCartService service = new ShoppingCartService();
		service.addProduct(new Product("�����", "���ѱ�", 1200));
		service.addProduct(new Product("������","����",3000));
		service.addProduct(new Product("¥�İ�Ƽ","���", 1500));
		service.printAll();
		
		int totalPrice = service.getTotalPrice();
		System.out.println("��ٱ��� ��ǰ �Ѿ�: "+totalPrice);
	}
}
