package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import common.IP;

public class ChatClient {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	private Scanner scanner;

	public void go() throws UnknownHostException, IOException {
		/*
		 * main thread - ��½�����
		 */
		try {
			//socket = new Socket("127.0.0.1", 5431);
			socket = new Socket(IP.INST, 5432);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			scanner = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			//Thread ���� �� setDaemon(true) ����
			System.out.println("Client�� ����Ǿ����ϴ�.");
			ReceiverWorker worker = new ReceiverWorker();
			Thread thread = new Thread(worker);
			thread.setDaemon(true); //ChatClient ����� ������ class�� ����
			thread.start();
			
			while(true) {
				String message = scanner.nextLine();
				pw.println(message);
				if(message.equals("exit"))
					break;
			}
			
			System.out.println("Client�� ����Ǿ����ϴ�.");
		} finally {
			if(scanner != null)
				scanner.close();
			if(socket != null)
				socket.close();
		}
	}

	// Nested class�� ReceiverWorker ����
	/*
	 * ReceiveWorker (inner class)�� ���� �Է½����� ���
	 * main thread ����� ���� class�� ���� ����
	 */
	public class ReceiverWorker implements Runnable {
		@Override
		public void run() {
			try {
				receiveMessage();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void receiveMessage() throws IOException {
			while(true) {
				String message = br.readLine();
				if(message == null || message.equals("exit"))
					break;
				System.out.println(message);
			}
		}
	}

	public static void main(String[] args) {
		try {
			new ChatClient().go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
