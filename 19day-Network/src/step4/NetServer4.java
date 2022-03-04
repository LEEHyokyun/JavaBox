package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer4 {
	public void go() throws IOException {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(5432);
			System.out.println("server�� �����Ǿ����ϴ�.");
			while(true) {
				Socket socket = serversocket.accept();
				String clientIP = socket.getInetAddress().toString();
				//client�� ���� �޽��� �Է�
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(clientIP+"�Բ��� ���� �޽����� �����Ͽ����ϴ�: "+br.readLine());
				//���� close
				br.close();
				socket.close();
			}
		}finally {
			if(serversocket != null)
				serversocket.close();
		}
	}
	public static void main(String[] args) {
		NetServer4 server = new NetServer4();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
