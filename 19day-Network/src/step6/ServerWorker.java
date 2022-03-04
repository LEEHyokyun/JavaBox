package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable{
	private Socket socket;
	/*
	 * 개별스레드가 만들어진후, 각 스레드별로 통신
	 */
	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		String clientIP = 	socket.getInetAddress().toString();
		System.out.println(clientIP+"님께서 입장하셨습니다.");
		try {
			echo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//echo 종료시 client가 종료된 것과 같으므로
		System.out.println(clientIP+"님이 퇴장하여 해당 server가 종료되었습니다.");
	}
	
	public void echo() throws IOException{
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			//클라이언트측 메시지 읽기
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			while(true) {
				String message = br.readLine();
				if(message == null || message.equals("exit"))
					break;
				System.out.println("메시지가 도착하였습니다: "+message);
				pw.println(message);
			}
			/*
			 * 메시지 전달과정이 완료되는 시점 자체가 서버가 종료되는 시점, 즉 함수가 종료되는 시점
			 * 실행 끝 = 통신 종료 = 서버도 같이 종료
			 */
		}finally {
			if(br != null)
				br.close();
			if(pw != null)
				pw.close();
		}
	}
}
