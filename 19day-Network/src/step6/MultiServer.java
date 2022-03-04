package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer{
	public void go() throws IOException {
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
			serversocket = new ServerSocket(5432);
			System.out.println("server�� �����Ǿ����ϴ�.");
			while(true) {
				socket = serversocket.accept();
				//client ���ӽ� thread ������, thread���� socket ���
				ServerWorker worker = new ServerWorker(socket);
				Thread thread = new Thread(worker);
				thread.start();
				/*
				 * key point : server ����� �� �����尡 �� ���̴�.
				 * main server������ ������ ���ุ ���ָ� �ȴ�.
				 */
			}
			/*
			 * ������ ������������� ����(�����庰�� �˾Ƽ�)
			 */
		} finally {
			if (socket != null)
				socket.close();
			if (serversocket != null)
				serversocket.close();
		}
	}
	
	public static void main(String[] args) {
		MultiServer server = new MultiServer();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
