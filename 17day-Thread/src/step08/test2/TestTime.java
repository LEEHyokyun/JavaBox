package step08.test2;

import java.text.SimpleDateFormat;

public class TestTime {
	public static void main(String[] args) {
		/*
		 * unique 인자를 통해 file 이름으로 설정 및 파일 생성
		 */
		long time = System.currentTimeMillis();
		//return long
		SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
		String nowTime = s.format(time);
		//현재 시간 정보를 얻을 수 있다.
		//System.out.println(nowTime);
	}
}
