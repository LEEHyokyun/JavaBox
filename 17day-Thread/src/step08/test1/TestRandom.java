package step08.test1;

import java.util.Random;
/*
 * thread1 - 파일을 생성하고 특정 경로에 직렬화한다.
 * thread2 - 직렬화된 파일을 확장자에 따라 분류 및 특정 디렉토리에 이동시킨다.
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
