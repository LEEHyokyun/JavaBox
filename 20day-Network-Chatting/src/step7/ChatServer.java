package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	private ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public void go() throws IOException {
		ServerSocket serversocket = null;
		Socket socket = null;
		try {
			serversocket = new ServerSocket(5432);
			System.out.println("Char server 실행");
			
			while(true) {
				socket = serversocket.accept();
				ServerWorker serverWorker = new ServerWorker(socket);
				list.add(serverWorker);
				Thread thread = new Thread(serverWorker);
				thread.start();
			}
		} finally {
			if(serversocket != null)
				serversocket.close();
		}

	}
	/*
	 * 접속한 모든 클라이언트에게 메시지를 출력
	 * list에 저장된 ServerWorker(Multi thread)들에게, 개별적으로 pw를 적용하여 메시지를 출력한다.
	 */
	public void broadcast(String message) {
		for(int i=0;i<list.size();i++) {
			//입장한 클라이언트들 모두에게 메시지 출력
			list.get(i).pw.println(message); 
		}
	}
	
	// Nested class
	public class ServerWorker implements Runnable{
		private Socket socket;
		private String clientIP;
		private BufferedReader br;
		private PrintWriter pw;
		
		public ServerWorker(Socket socket) {
			super();
			this.socket = socket;
		}
		
		@Override
		public void run() {
			try {
				chatting();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(socket != null)
					try {
						socket.close();
					}catch(IOException e) {
						e.printStackTrace();
					}
					list.remove(this); //run() 종료는 곧 client 종료, 활성화된 객체(this)를 list에서 제거
					/*
					 * ServerWorker가 분할하여 client 관리중, client가 종료될 경우(현재 활성화된 객체의 종료)
					 * list에서 제거하여, chat 관리대상에서 제외한다.
					 */
					//broadcast를 이용하여 client 종료 명기 
					broadcast(clientIP+"님께서 퇴장하셨습니다.");
				}
		}
		
		public void chatting() throws IOException{
			clientIP = socket.getInetAddress().toString();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			broadcast(clientIP+"님께서 입장하셨습니다.");
			while(true) {
				String message = br.readLine();
				if(message == null || message.equals("exit"))
					break;
				/*
				 * 모든 client에게 message 전송 및 출력
				 */
				broadcast(clientIP+"님께서 메시지를 입력하셨습니다: "+message);
			}
		}
		
	}
	
	public static void main(String[] args) {
		try {
			new ChatServer().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
