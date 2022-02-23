package step2;

public class TestThrow2 {
	public static void main(String[] args) {
		ReviewService service = new ReviewService();
		int money = 100; //normal
		
		try{
			service.deposit(money);
			money= 0; //abnormal - Exception
			service.deposit(money);
		}catch(ReviewException e) {
			System.out.println("ReviewException�� �߻��Ͽ����ϴ�.");
			System.out.println(e.getMessage());
			//e.printTrace...
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}
}
