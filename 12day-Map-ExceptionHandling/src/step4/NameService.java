package step4;

public class NameService {

	public void printMessage(String name) {
		String info = name.concat(" ����");
		/*
		 * name = null�� ���, Runtime �迭�� NullPointerException �߻�
		 * �̶� unchecked exception����, ���� throw�� ��������� �ʾƵ� �ڵ������� �ش� �޼ҵ带 ȣ���� Ŭ������ throw�Ѵ�.
		 * main���� try/catch������ �ʴ´ٸ�, �ڵ������� main�� JVM���� throw�Ѵ�.
		 */
		System.out.println(info);
	}

}
