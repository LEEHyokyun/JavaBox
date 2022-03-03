package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServer1 {
	public void go() throws IOException {
		//대표전화
		ServerSocket serverSocket=new ServerSocket(5430);
		System.out.println("**NetServer1 실행**");
		//클라이언트 접속 대기하다 접속하면 실행된다
		//실행 후 반환되는 소켓은 실제 클라이언트와 통신할 개별 소켓이다 
		//아래 소켓은 클라이언트와 실제 통신하는 전화기 
		Socket socket=serverSocket.accept();
		System.out.println("**client가 서버에 접속함**");
		//접속한 클라이언트에게 메세지를 출력한다 
		PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);//autoflush : println() 즉시 클라이언트로 출력 
		pw.println("즐거운 목요일 오후입니다");
		pw.close();
		socket.close();
		serverSocket.close();
		System.out.println("**NetServer1 종료**");
	}
	public static void main(String[] args) {
		NetServer1 server=new NetServer1();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
