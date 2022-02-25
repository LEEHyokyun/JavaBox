package step6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import common.Path;
import step5.Person;
/*
 * ������ȭ : object file�� heap���� ����
 */
public class TestObjectInput {
	public static void main(String[] args) {
		try {
			//node stream
			FileInputStream fis = new FileInputStream(Path.TEST_PATH+"person.obj");
			//��ü���� process stream
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Person p = (Person) obj;
			System.out.println(p.getAddress());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
