package step3;

public class TestMap3 {
	public static void main(String[] args) {
		ShoppingCartService service = new ShoppingCartService();
		
		service.addProduct(new Product("1","진라면","오뚜기",1000));
		service.addProduct(new Product("2","열라면","오뚜기",1200));
		service.addProduct(new Product("3","너구리","농심",1300));
		
		//자료구조 Map를 이용한 상품등록
		System.out.println("장바구니에 상품을 추가");
		service.printAll();
		System.out.println("***아이디로 상품을 검색합니다***");
		String id = "1";
		System.out.println(service.findProductById(id));
		id = "4";
		System.out.println(service.findProductById(id));
		service.printAll();
	}
}
