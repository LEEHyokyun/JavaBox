package step3;

import java.util.ArrayList;

public class TestException8 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("장범준");
		list.add("아이유");
		try {
			list.get(2);
			System.out.println("a");
		}catch(NullPointerException e) {
			System.out.println("b");
		}finally {
			System.out.println("c");
		}
		/*
		 * IndexOutOfBoundException 처리가 되지 않았기 때문에
		 * main 구문은 실행되지 않는다.
		 */
		System.out.println("d");
	}
}
