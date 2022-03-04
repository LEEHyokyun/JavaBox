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
		System.out.println("client�� �����Ǿ� server�� �����Ͽ����ϴ�.");
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		//Scanner�� ���� �Է�
		Scanner scanner = new Scanner(System.in);
		System.out.println("server�� ���� �޽����� �Է��ϼ���: ");
		String message = scanner.nextLine();
		pw.println(message);
		scanner.close();
		pw.close();
		socket.close();
		System.out.println("client�� ����Ǿ����ϴ�.");
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
