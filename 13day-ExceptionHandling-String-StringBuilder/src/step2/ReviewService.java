package step2;

public class ReviewService{
	public void deposit(int money) throws ReviewException{
		
		try{
			if(money == 0) {
				throw new ReviewException(money+"��(��) �߸��� �Աݾ��Դϴ�.");
				}
		}finally {
			System.out.println("ReviewException�� ����Ǿ����ϴ�.");
		}
			
	}
}
