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
		//password 정보는 transient로 선언하여 외부 파일로 직렬화하지 않는다.
		//따라서 비직렬화를 통해 password 정보는 얻을 수 없다(null).
		System.out.println(account.getPassword());
	}
}
