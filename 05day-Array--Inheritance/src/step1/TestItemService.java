package step1;

public class TestItemService {
	public static void main(String[] args) {
		ItemVO[] items = {
				new ItemVO("�����", "���ѱ�", 1200),
				new ItemVO("¥�İ�Ƽ", "���", 1500),
				new ItemVO("�Ҵ�", "���", 1700)		
		};
		//���ǵ� VO��ü���� ItemService�� ����, �´� �װ��� ���
		//�����Ǵ� ���, �� �޼ҵ带 ����!
		ItemService service = new ItemService();
		service.printItemNames(items);
		int price = 1600;
		//price �̸��� ������ ���� ��ǰ���� name, price ���
		service.printItemNameAndPriceLessThanPrice(items, price);
	}
}
