package step9;

public class TestIf3 {
	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(100); //100���� �Ա�
		a.deposit(200); //200���� �Ա�
		a.deposit(0);
		System.out.println(a.getAmount());
	}
}
