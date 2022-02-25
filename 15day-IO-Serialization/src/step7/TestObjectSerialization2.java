package step7;

import java.io.IOException;

public class TestObjectSerialization2 {
	public static void main(String[] args) {
		//Deserialization
		AccountService service = new AccountService();
		Account account = null;
		try {
			account = service.loadObject();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(account.getName());
		//password ������ transient�� �����Ͽ� �ܺ� ���Ϸ� ����ȭ���� �ʴ´�.
		//���� ������ȭ�� ���� password ������ ���� �� ����(null).
		System.out.println(account.getPassword());
	}
}
