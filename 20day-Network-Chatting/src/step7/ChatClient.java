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
		 * main thread - 출력스레드
		 */
		try {
			//socket = new Socket("127.0.0.1", 5431);
			socket = new Socket(IP.INST, 5432);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			scanner = new Scanner(System.in);
			pw = new PrintWriter(socket.getOutputStream(), true);
			
			//Thread 생성 및 setDaemon(true) 설정
			System.out.println("Client가 실행되었습니다.");
			ReceiverWorker worker = new ReceiverWorker();
			Thread thread = new Thread(worker);
			thread.setDaemon(true); //ChatClient 종료시 별도의 class도 종료
			thread.start();
			
			while(true) {
				String message = scanner.nextLine();
				pw.println(message);
				if(message.equals("exit"))
					break;
			}
			
			System.out.println("Client가 종료되었습니다.");
		} finally {
			if(scanner != null)
				scanner.close();
			if(socket != null)
				socket.close();
		}
	}

	// Nested class로 ReceiverWorker 정의
	/*
	 * ReceiveWorker (inner class)를 통한 입력스레드 운용
	 * main thread 종료시 내부 class도 같이 종료
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
