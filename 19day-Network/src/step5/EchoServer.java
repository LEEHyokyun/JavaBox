package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 1:1 ����� ���� ���
 * client���� ���� �޽����� �޾�, �ٽ� �̸� client���� ����(���)�ϴ� ����
 * ����� ����(BufferedReader / PrintWriter) ��ü�� server�� client ����
 */
public class EchoServer {
	public void go() throws IOException {
		ServerSocket serversocket = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			serversocket = new ServerSocket(5432);
			System.out.println("server�� ����Ǿ����ϴ�.");
			socket = serversocket.accept();
			String clientIP = socket.getInetAddress().toString();
			System.out.println(clientIP + "�Բ��� �����ϼ̽��ϴ�.");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// �޽��� �Է�
			pw = new PrintWriter(socket.getOutputStream(), true);
			// �޽��� ���
			while (true) {
				String message = br.readLine();
				if (message == null || message.equals("exit")) {
					/*
					 * server�� ����� �� �ִ� ������ client�� �޽����� ���ų�, exit�� ���
					 */
					System.out.println(clientIP + "�Բ��� �����ϼ̽��ϴ�.");
					break;
				}
				System.out.println(clientIP + "�Բ��� �޽����� �����̽��ϴ�: " + message);
				pw.println(message);
			}
			System.out.println("EchoServer�� ����Ǿ����ϴ�.");
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
	 * client�� server�� �����ϴ� Ư���� ������ �ִ� ���� �ƴϴ�. �ݺ��� ����� �׳� server, client ����.
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
