package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient3 {
	public void go() throws UnknownHostException, IOException {
		//server에 접속하여 server에게 메세지를 출력한다.
		//127.0.0.1
		//Socket socket = new Socket(IP.INST,5432);
		Socket socket = new Socket("127.0.0.1", 5431);
		System.out.println("NetClient3의 소켓이 생성 및 실행되었습니다.");
		//server에게 메세지를 출력
		//socket byte stream -> printwriter character stream
		//socket에서 data를 입력받는 즉시 출력한다, auto flush
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		pw.println("모두 고생많으셨습니다~!");
		//stream, socket close
		pw.close();
		socket.close();
		System.out.println("NetClient3의 소켓이 제거되었습니다.");
	}
	public static void main(String[] args) {
		NetClient3 client = new NetClient3();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
