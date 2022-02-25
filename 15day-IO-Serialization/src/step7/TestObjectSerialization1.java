package step7;

import java.io.IOException;

public class TestObjectSerialization1 {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		Account account = new Account("아이유","spring",100);
		
		try {
			service.saveObject(account);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("계좌객체를 직렬화하여 외부 파일 형태로 저장하였습니다.");
	}
}
