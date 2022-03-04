package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// client�� ���� �޽����� �Է¹޾� ȭ�鿡 ����ϴ� ����
public class NetServer3 {
	public void go() throws IOException {
		ServerSocket serversocket = null;
		BufferedReader br = null;
		try {
			serversocket = new ServerSocket(5431);
			System.out.println("NetServer3�� ����˴ϴ�.");
			while(true) {
				Socket socket = serversocket.accept(); //Ŭ���̾�Ʈ ���ӽ� ���� �� ������ ����� ������ socket�� ��ȯ
				String clientIP = socket.getInetAddress().toString(); //���� ������ Ŭ���̾�Ʈ�� IP�ּҸ� ��ȯ�޴´�.
				//������ Ŭ���̾�Ʈ�� �޼����� �Է¹޾� ����Ѵ�.
				//�⺻������ socket�� �޼����� 8bit, �̸� 16bit�� �Է¹ް��� �ϱ� ����
				 br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String message = br.readLine();
				//Ŭ���̾�Ʈ�� �� ����� �޼����� �޾� �ٽ� ȭ�鿡 �Է��Ѵ�.
				System.out.println(clientIP+"���� �޼����� �Է¹޾� ����մϴ�: "+message);
				/*
				 * �������� �޽��� ����� �ܼ�â����.
				 */
				//Ŭ���̾�Ʈ ���� InputReader�� socket�� close
				br.close();
				socket.close();
			}
			
		}finally{
			if(serversocket != null)
				serversocket.close();
		}
	}
	
	public static void main(String[] args) {
		NetServer3 server = new NetServer3();
		try {
			server.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
