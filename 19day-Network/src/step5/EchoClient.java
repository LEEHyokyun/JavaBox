package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 1:1 양방향 지속 통신
 * client에서 보낸 메시지를 받아, 다시 이를 client에게 전송(출력)하는 구조
 * 입출력 구조(BufferedReader / PrintWriter) 자체는 server와 client 동일
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scanner = null;

		try {
			socket = new Socket("127.0.0.1", 5432);
			System.out.println("client가 생성되어 server에 접속하였습니다.");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				System.out.println("server에게 보낼 메시지를 입력하세요: ");
				scanner = new Scanner(System.in);
				String message = scanner.nextLine();
				pw.println(message);
				if (message.equals("exit"))
					break;

				String serverMessage = br.readLine();
				System.out.println("server로부터 메시지를 받았습니다: " + serverMessage);
			}
			System.out.println("client 퇴장완료");
		} finally {
			if (scanner != null)
				scanner.close();
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
			if (socket != null)
				socket.close();
		}
	}

	/*
	 * client나 server를 종료하는 특별한 로직이 있는 것이 아니다. 반복문 종료시 그냥 server, client 종료.
	 */

	public static void main(String[] args) {
		EchoClient client = new EchoClient();
		try {
			client.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
