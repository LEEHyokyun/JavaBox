package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import common.Path;

public class TestInput3 {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader(Path.TEST_PATH+"order.txt");
			BufferedReader br = new BufferedReader(f); 
			//한라인씩 Read, 더이상 읽어올 line이 없다면 null return.
			String data = null;
			do {
				data = br.readLine();
				System.out.println(data);
			}while(data!=null);
			
			br.close(); //processing stream close
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
