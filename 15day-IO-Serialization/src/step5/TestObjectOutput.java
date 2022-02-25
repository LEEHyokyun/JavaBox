package step5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import common.Path;

/*
 * Object Serialization
 */
public class TestObjectOutput {
	public static void main(String[] args) {
		//Person p;
		try {
			FileOutputStream fos = new FileOutputStream(Path.TEST_PATH+"person.obj");
			//�� ���� �� ��η� ���������� write �� obj ��������!
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Person("������","����",500));
			oos.close();
			/*
			 * ����ȭ ���� �޼ҵ带 ����ϱ� ���ؼ�
			 * NotSerializableException: ���ܹ߻��� �����ϱ�����
			 * Serializable interface ���������� �������Ѵ�.
			 */
			System.out.println("�ܺη� ���������� �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
