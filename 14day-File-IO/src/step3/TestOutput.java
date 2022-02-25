package step3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestOutput {
	public static void main(String[] args) {
		// 파일을 생성하고 파일에 문자열을 출력
		// Writer (output 문자열 스트림)
		// NodeStream : 직접 장치에 연결 > FileWriter
		// processingStream : 다양한 기능을 제공
		// ㄴ PrinterWriter (println() , 한 라인씩 문자열 출력)
		try {
			String path = "C:" + File.separator + "kosta238" + File.separator + "iotest" + File.separator + "output.txt";
			FileWriter fw = new FileWriter(path,true);//true : append
			PrintWriter pw = new PrintWriter(fw);
			/*
			 * FileWriter라는 Nodestream은 output.txt라는 장치(data)에 직접 연결되었다.
			 * 	이 Nodestream 객체를 받아서 processing stream은 이를 활용하여 제어기능을 제공한다.
			 */
			pw.println("진미평양냉면"); //이어져있는 대상 장치에 data write 
			pw.close(); //stream close(buffer에 있는 정보를 대상 장치에 보내준다(flush, 배출한다).
			/*
			 * 반드시 close 필요(close와 동시에 buffer에 저장한 data를 전달)
			 * 일단은 buffer에 저장, close를 하면서 최종적으로 대상 장치에 보낸다(flush).
			 */
			System.out.println("파일이 생성되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
