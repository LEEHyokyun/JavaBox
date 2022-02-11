package step1;

public class TestItemService {
	public static void main(String[] args) {
		ItemVO[] items = {
				new ItemVO("진라면", "오뚜기", 1200),
				new ItemVO("짜파게티", "농심", 1500),
				new ItemVO("불닭", "삼양", 1700)		
		};
		//정의된 VO객체들을 ItemService에 전달, 걔는 그것을 출력
		//대응되는 기능, 즉 메소드를 생성!
		ItemService service = new ItemService();
		service.printItemNames(items);
		int price = 1600;
		//price 미만의 가격을 가진 상품들의 name, price 출력
		service.printItemNameAndPriceLessThanPrice(items, price);
	}
}
