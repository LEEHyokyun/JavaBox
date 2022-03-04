package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import common.IP;

public class NetClient4 {
	public void go() throws IOException {
		Socket socket = new Socket(IP.INST,5432);
		//server IP, server port
		System.out.println("client가 생성되어 server에 접속하였습니다.");
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		//Scanner를 통한 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("server에 보낼 메시지를 입력하세요: ");
		String message = scanner.nextLine();
		pw.println(message);
		scanner.close();
		pw.close();
		socket.close();
		System.out.println("client가 종료되었습니다.");
	}
	
	public static void main(String[] args) {
		NetClient4 client = new NetClient4();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
