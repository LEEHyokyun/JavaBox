package step08.test1;

import java.util.Random;
/*
 * thread1 - ������ �����ϰ� Ư�� ��ο� ����ȭ�Ѵ�.
 * thread2 - ����ȭ�� ������ Ȯ���ڿ� ���� �з� �� Ư�� ���丮�� �̵���Ų��.
 */
public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		String ext = null;
		if(r.nextBoolean()) {
			ext = ".avi";
		}else {
			ext = ".mp3";
		}
		
	}
}
