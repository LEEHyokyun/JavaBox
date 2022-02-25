package step7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import common.Path;

public class AccountService {
	private String path = Path.TEST_PATH + "account.obj";

	public void saveObject(Account account) throws IOException {
		// FileOutputStream fos = new FileOutputStream(path);
		// nodestream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		try {
			oos.writeObject(account);
			// proecessing stream
		} finally {
			if (oos != null)
				oos.close();
			// flush and close
		}
	}

	public Account loadObject() throws FileNotFoundException, IOException{
		Account account = null;
		ObjectInputStream ois = null;
		//FileInputStream fis = new FileInputStream(path);
		// file node stream
		//ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		// processing stream
		try {
			/*
			 * processing stream을 통해 read한 object를 다운캐스팅하여 읽는다.
			 */
			ois = new ObjectInputStream(new FileInputStream(path));
			Object obj = ois.readObject();
			account = (Account) obj;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/*
			 * processing stream close 필수
			 */
			if(ois != null) ois.close();
		}
		return account;
	}
}
