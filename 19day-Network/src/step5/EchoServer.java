package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1:1 양방향 지속 통신
 * client에서 보낸 메시지를 받아, 다시 이를 client에게 전송(출력)하는 구조
 * 입출력 구조(BufferedReader / PrintWriter) 자체는 server와 client 동일
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket serversocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			serversocket = new ServerSocket(5432);
			System.out.println("server가 실행되었습니다.");
			socket = serversocket.accept();
			String clientIP = socket.getInetAddress().toString();
			System.out.println(clientIP + "님께서 입장하셨습니다.");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 메시지 입력
			pw = new PrintWriter(socket.getOutputStream(), true);
			// 메시지 출력
			while (true) {
				String message = br.readLine();
				if (message == null || message.equals("exit")) {
					/*
					 * server가 종료될 수 있는 조건은 client의 메시지가 없거나, exit인 경우
					 */
					System.out.println(clientIP + "님께서 퇴장하셨습니다.");
					break;
				}
				System.out.println(clientIP + "님께서 메시지를 보내셨습니다: " + message);
				pw.println(message);
			}
			System.out.println("EchoServer가 종료되었습니다.");
		} finally {
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
			if (serversocket != null)
				serversocket.close();
		}
	}

	/*
	 * client나 server를 종료하는 특별한 로직이 있는 것이 아니다. 반복문 종료시 그냥 server, client 종료.
	 */

	public static void main(String[] args) {
		EchoServer server = new EchoServer();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
