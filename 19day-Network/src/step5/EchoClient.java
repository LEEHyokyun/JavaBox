package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * 1:1 ����� ���� ���
 * client���� ���� �޽����� �޾�, �ٽ� �̸� client���� ����(���)�ϴ� ����
 * ����� ����(BufferedReader / PrintWriter) ��ü�� server�� client ����
 */
public class EchoClient {
	public void go() throws UnknownHostException, IOException {
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner scanner = null;

		try {
			socket = new Socket("127.0.0.1", 5432);
			System.out.println("client�� �����Ǿ� server�� �����Ͽ����ϴ�.");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			while (true) {
				System.out.println("server���� ���� �޽����� �Է��ϼ���: ");
				scanner = new Scanner(System.in);
				String message = scanner.nextLine();
				pw.println(message);
				if (message.equals("exit"))
					break;

				String serverMessage = br.readLine();
				System.out.println("server�κ��� �޽����� �޾ҽ��ϴ�: " + serverMessage);
			}
			System.out.println("client ����Ϸ�");
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
	 * client�� server�� �����ϴ� Ư���� ������ �ִ� ���� �ƴϴ�. �ݺ��� ����� �׳� server, client ����.
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
