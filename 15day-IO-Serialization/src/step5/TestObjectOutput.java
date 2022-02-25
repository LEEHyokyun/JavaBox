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
			//이 파일 및 경로로 최종적으로 write 및 obj 생성예정!
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Person("아이유","용인",500));
			oos.close();
			/*
			 * 직렬화 관련 메소드를 사용하기 위해선
			 * NotSerializableException: 예외발생을 방지하기위해
			 * Serializable interface 계층구조를 만들어야한다.
			 */
			System.out.println("외부로 직렬전송이 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
