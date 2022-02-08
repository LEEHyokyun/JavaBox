package step9;

public class Account {
	private int amount = 0;
	
	public int deposit(int add) {
		if(add == 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
		amount = amount + add;
		}
		return amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
}
