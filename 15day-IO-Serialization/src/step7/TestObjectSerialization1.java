package step7;

import java.io.IOException;

public class TestObjectSerialization1 {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		Account account = new Account("������","spring",100);
		
		try {
			service.saveObject(account);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���°�ü�� ����ȭ�Ͽ� �ܺ� ���� ���·� �����Ͽ����ϴ�.");
	}
}
