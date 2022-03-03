package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer2 {
	public void go() throws IOException {
		//대표전화
		ServerSocket serverSocket = null;
		try {
			serverSocket=new ServerSocket(5432);
			System.out.println("**NetServer2 실행중**");
			int count = 1;
			while(true) {
				Socket socket = serverSocket.accept();
				String clientIp = socket.getInetAddress().toString(); //접속한 client의 ip를 받아온다
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println(clientIp+" client에게 메세지를 출력하겠습니다: "+count);
				System.out.println(clientIp+" client에게 메세지를 출력하겠습니다: "+count);
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
