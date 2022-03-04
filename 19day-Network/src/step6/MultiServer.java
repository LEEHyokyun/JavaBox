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
			System.out.println("server가 생성되었습니다.");
			while(true) {
				socket = serversocket.accept();
				//client 접속시 thread 만든후, thread에서 socket 통신
				ServerWorker worker = new ServerWorker(socket);
				Thread thread = new Thread(worker);
				thread.start();
				/*
				 * key point : server 종료는 각 스레드가 할 일이다.
				 * main server에서는 스레드 실행만 해주면 된다.
				 */
			}
			/*
			 * 별도의 서버종료로직은 없음(스레드별로 알아서)
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
