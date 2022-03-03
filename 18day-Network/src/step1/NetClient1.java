package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetClient1 {
	public void go() throws UnknownHostException, IOException {
		//client socket 생성 및 서버 접속, 이 순간에 서버소켓이 생성된다.
		Socket socket = new Socket("127.0.0.1",5430);
		System.out.println("**NetClinet1 실행**");
		//ByteStream을 CharacterStream을 변환하는 process Stream, InputStreamReader를 이용
		InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		//그 후 buffered Read를 이용하여 입력받고, 이를 화면에 출력
		BufferedReader br = new BufferedReader(ir);
		String message = br.readLine();
		System.out.println("**메세지 출력: "+message);
		br.close();
		socket.close();
		System.out.println("**NetClinet1 종료**");
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
