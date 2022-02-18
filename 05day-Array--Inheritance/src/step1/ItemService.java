package step1;
//Service : 비즈니스 로직, 트랜잭션(업무)를 정의하는 객체
public class ItemService {
	public void printItemNames(ItemVO[] items) {
		//인자로 참조형 데이터인 객체배열이 전달
		for(int i=0;i<items.length;i++) {
			System.out.println(items[i].getName());
		}
	}

	public void printItemNameAndPriceLessThanPrice(ItemVO[] items, int price) {
		for(int i=0;i<items.length;i++) {
			if(items[i].getPrice() < price) {
				System.out.println("가격은 "+items[i].getPrice()+" 그리고 상품이름은 "+items[i].getName());
			}
		}
		
	}
}
