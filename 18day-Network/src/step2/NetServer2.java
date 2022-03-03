package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer2 {
	public void go() throws IOException {
		//��ǥ��ȭ
		ServerSocket serverSocket = null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**NetServer2 ������**");
			int count = 1;
			while(true) {
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString(); //������ client�� ip�� �޾ƿ´�
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println(clientIp+" client���� �޼����� ����ϰڽ��ϴ�: "+count);
				System.out.println(clientIp+" client���� �޼����� ����ϰڽ��ϴ�: "+count);
				count ++;
				pw.close();
				socket.close();
			}
		} finally {
			if(serverSocket != null)
				serverSocket.close();
		}
	}
	public static void main(String[] args) {
		NetServer2 server=new NetServer2();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
