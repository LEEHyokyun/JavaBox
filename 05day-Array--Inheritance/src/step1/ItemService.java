package step1;
//Service : ����Ͻ� ����, Ʈ�����(����)�� �����ϴ� ��ü
public class ItemService {
	public void printItemNames(ItemVO[] items) {
		//���ڷ� ������ �������� ��ü�迭�� ����
		for(int i=0;i<items.length;i++) {
			System.out.println(items[i].getName());
		}
	}

	public void printItemNameAndPriceLessThanPrice(ItemVO[] items, int price) {
		for(int i=0;i<items.length;i++) {
			if(items[i].getPrice() < price) {
				System.out.println("������ "+items[i].getPrice()+" �׸��� ��ǰ�̸��� "+items[i].getName());
			}
		}
		
	}
}
