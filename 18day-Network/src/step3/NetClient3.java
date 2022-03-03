package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient3 {
	public void go() throws UnknownHostException, IOException {
		//server�� �����Ͽ� server���� �޼����� ����Ѵ�.
		//127.0.0.1
		//Socket socket = new Socket(IP.INST,5432);
		Socket socket = new Socket("127.0.0.1", 5431);
		System.out.println("NetClient3�� ������ ���� �� ����Ǿ����ϴ�.");
		//server���� �޼����� ���
		//socket byte stream -> printwriter character stream
		//socket���� data�� �Է¹޴� ��� ����Ѵ�, auto flush
		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		pw.println("��� ��������̽��ϴ�~!");
		//stream, socket close
		pw.close();
		socket.close();
		System.out.println("NetClient3�� ������ ���ŵǾ����ϴ�.");
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
