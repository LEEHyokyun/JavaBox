package step9;

public class Account {
	private int amount = 0;
	
	public int deposit(int add) {
		if(add == 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}else {
		amount = amount + add;
		}
		return amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
}
