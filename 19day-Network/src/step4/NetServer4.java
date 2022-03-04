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
			System.out.println("server가 생성되었습니다.");
			while(true) {
				Socket socket = serversocket.accept();
				String clientIP = socket.getInetAddress().toString();
				//client가 보낸 메시지 입력
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(clientIP+"님께서 보낸 메시지가 도착하였습니다: "+br.readLine());
				//최종 close
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
