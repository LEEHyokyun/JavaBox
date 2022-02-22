package step1;

public class TestMap3 {
	public static void main(String[] args) {
		ShoppingCartService service = new ShoppingCartService();
		
		service.addProduct(new Product("1","�����","���ѱ�",1000));
		service.addProduct(new Product("2","�����","���ѱ�",1200));
		service.addProduct(new Product("3","�ʱ���","���",1300));
		
		//�ڷᱸ�� Map�� �̿��� ��ǰ���
		System.out.println("��ٱ��Ͽ� ��ǰ�� �߰�");
		service.printAll();
		System.out.println("***���̵�� ��ǰ�� �˻��մϴ�***");
		String id = "1";
		System.out.println(service.findProductById(id));
		id = "4";
		System.out.println(service.findProductById(id));
		service.printAll();
		System.out.println("*******Id�� ��ǰ����*******");
		System.out.println("*******������ ��ٱ��Ͽ� �ִ� ��ǰ ����*******");
		service.printAll();
		service.deleteProductById("2");
		System.out.println("*******������ ��ٱ��Ͽ� �ִ� ��ǰ ����*******");
		service.printAll();
		System.out.println("*******��ٱ��Ͽ� �ִ� ��ǰ�Ѿ�********");
		int totalPrice = service.getTotalPrice();
		System.out.println("��ǰ�Ѿ�: " + totalPrice);
	}
}
