package step08.test2;

import java.text.SimpleDateFormat;

public class TestTime {
	public static void main(String[] args) {
		/*
		 * unique ���ڸ� ���� file �̸����� ���� �� ���� ����
		 */
		long time = System.currentTimeMillis();
		//return long
		SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
		String nowTime = s.format(time);
		//���� �ð� ������ ���� �� �ִ�.
		//System.out.println(nowTime);
	}
}
