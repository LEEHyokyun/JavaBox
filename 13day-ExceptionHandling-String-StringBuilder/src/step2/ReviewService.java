package step2;

public class ReviewService{
	public void deposit(int money) throws ReviewException{
		
		try{
			if(money == 0) {
				throw new ReviewException(money+"는(은) 잘못된 입금액입니다.");
				}
		}finally {
			System.out.println("ReviewException이 실행되었습니다.");
		}
			
	}
}
