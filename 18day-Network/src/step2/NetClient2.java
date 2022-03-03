package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import common.IP;

public class NetClient2 {
	public void go() throws UnknownHostException, IOException {
		//client socket ���� �� ���� ����, �� ������ ���������� �����ȴ�.
		Socket socket = new Socket(IP.INST,5432);
		System.out.println("**NetClinet2 ����**");
		//ByteStream�� CharacterStream�� ��ȯ�ϴ� process Stream, InputStreamReader�� �̿�
		InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		//�� �� buffered Read�� �̿��Ͽ� �Է¹ް�, �̸� ȭ�鿡 ���
		BufferedReader br = new BufferedReader(ir);
		String message = br.readLine();
		System.out.println("**�޼��� ���: "+message);
		br.close();
		socket.close();
		System.out.println("**NetClinet2 ����**");
	}
	public static void main(String[] args) {
		NetClient2 client = new NetClient2();
		try {
			client.go();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
