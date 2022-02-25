package step5;

import java.io.InputStream;
import java.util.Scanner;

public class TestConsoleInput {
	public static void main(String[] args) {
		InputStream is = System.in;
		//console에서 입력을 받는 InputStream
		//콘솔장치에 연결된 'nodestream'
		Scanner sc = new Scanner(is);
		//sc.close(); //node stream에 연결된 processing stream 제거!
		
		String name = sc.nextLine();	 //한 라인씩 입력
		sc.close(); 
	}
}
