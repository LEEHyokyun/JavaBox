package step3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyAndPasteService {
	private String copyFilePath;
	private String pasteFilePath;

	public CopyAndPasteService(String copyFilePath, String pasteFilePath) {
		super();
		this.copyFilePath = copyFilePath;
		this.pasteFilePath = pasteFilePath;
	}

	public void copyAndPasteFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(copyFilePath));
		PrintWriter pw = new PrintWriter(new FileWriter(pasteFilePath, true),true);
		//�Ѷ��ξ� Read, ���̻� �о�� line�� ���ٸ� null return.
		try {
			while(br.ready()) {
				String data = br.readLine();
				pw.println(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null) br.close();
			if(pw!=null) pw.close();
		}
		
		br.close(); //processing stream close
	}

}
