package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker implements Runnable{
	private Socket socket;
	/*
	 * ���������尡 ���������, �� �����庰�� ���
	 */
	public ServerWorker(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		String clientIP = 	socket.getInetAddress().toString();
		System.out.println(clientIP+"�Բ��� �����ϼ̽��ϴ�.");
		try {
			echo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//echo ����� client�� ����� �Ͱ� �����Ƿ�
		System.out.println(clientIP+"���� �����Ͽ� �ش� server�� ����Ǿ����ϴ�.");
	}
	
	public void echo() throws IOException{
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			//Ŭ���̾�Ʈ�� �޽��� �б�
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			while(true) {
				String message = br.readLine();
				if(message == null || message.equals("exit"))
					break;
				System.out.println("�޽����� �����Ͽ����ϴ�: "+message);
				pw.println(message);
			}
			/*
			 * �޽��� ���ް����� �Ϸ�Ǵ� ���� ��ü�� ������ ����Ǵ� ����, �� �Լ��� ����Ǵ� ����
			 * ���� �� = ��� ���� = ������ ���� ����
			 */
		}finally {
			if(br != null)
				br.close();
			if(pw != null)
				pw.close();
		}
	}
}
