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
			System.out.println("Char server ����");
			
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
	 * ������ ��� Ŭ���̾�Ʈ���� �޽����� ���
	 * list�� ����� ServerWorker(Multi thread)�鿡��, ���������� pw�� �����Ͽ� �޽����� ����Ѵ�.
	 */
	public void broadcast(String message) {
		for(int i=0;i<list.size();i++) {
			//������ Ŭ���̾�Ʈ�� ��ο��� �޽��� ���
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
					list.remove(this); //run() ����� �� client ����, Ȱ��ȭ�� ��ü(this)�� list���� ����
					/*
					 * ServerWorker�� �����Ͽ� client ������, client�� ����� ���(���� Ȱ��ȭ�� ��ü�� ����)
					 * list���� �����Ͽ�, chat ������󿡼� �����Ѵ�.
					 */
					//broadcast�� �̿��Ͽ� client ���� ��� 
					broadcast(clientIP+"�Բ��� �����ϼ̽��ϴ�.");
				}
		}
		
		public void chatting() throws IOException{
			clientIP = socket.getInetAddress().toString();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			broadcast(clientIP+"�Բ��� �����ϼ̽��ϴ�.");
			while(true) {
				String message = br.readLine();
				if(message == null || message.equals("exit"))
					break;
				/*
				 * ��� client���� message ���� �� ���
				 */
				broadcast(clientIP+"�Բ��� �޽����� �Է��ϼ̽��ϴ�: "+message);
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
