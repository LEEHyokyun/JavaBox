package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// client가 보낸 메시지를 입력받아 화면에 출력하는 역할
public class NetServer3 {
	public void go() throws IOException {
		ServerSocket serversocket = null;
		BufferedReader br = null;
		try {
			serversocket = new ServerSocket(5431);
			System.out.println("NetServer3가 실행됩니다.");
			while(true) {
				Socket socket = serversocket.accept(); //클라이언트 접속시 실행 및 실제로 통신을 진행할 socket을 반환
				String clientIP = socket.getInetAddress().toString(); //현재 접속한 클라이언트의 IP주소를 반환받는다.
				//서버는 클라이언트의 메세지를 입력받아 출력한다.
				//기본적으로 socket의 메세지는 8bit, 이를 16bit로 입력받고자 하기 위함
				 br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String message = br.readLine();
				//클라이언트는 그 출력한 메세지를 받아 다시 화면에 입력한다.
				System.out.println(clientIP+"님의 메세지를 입력받아 출력합니다: "+message);
				/*
				 * 실제적인 메시지 출력은 콘솔창에서.
				 */
				//클라이언트 폐기시 InputReader와 socket을 close
				br.close();
				socket.close();
			}
			
		}finally{
			if(serversocket != null)
				serversocket.close();
		}
	}
	
	public static void main(String[] args) {
		NetServer3 server = new NetServer3();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
