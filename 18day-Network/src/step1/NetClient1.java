package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetClient1 {
	public void go() throws UnknownHostException, IOException {
		//client socket ���� �� ���� ����, �� ������ ���������� �����ȴ�.
		Socket socket = new Socket("127.0.0.1",5430);
		System.out.println("**NetClinet1 ����**");
		//ByteStream�� CharacterStream�� ��ȯ�ϴ� process Stream, InputStreamReader�� �̿�
		InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		//�� �� buffered Read�� �̿��Ͽ� �Է¹ް�, �̸� ȭ�鿡 ���
		BufferedReader br = new BufferedReader(ir);
		String message = br.readLine();
		System.out.println("**�޼��� ���: "+message);
		br.close();
		socket.close();
		System.out.println("**NetClinet1 ����**");
	}
	public static void main(String[] args) {
		NetClient1 client = new NetClient1();
		try {
			client.go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
