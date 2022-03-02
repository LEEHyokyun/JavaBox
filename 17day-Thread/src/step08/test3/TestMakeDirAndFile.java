package step08.test3;

import java.io.File;
import java.io.IOException;

public class TestMakeDirAndFile {
	//���丮 �� ���� ����
	public static void main(String[] args) {
		String dirPath = "C:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test";
		File dir = new File(dirPath);
		
		if(!dir.isDirectory()) {
			dir.mkdirs();
		}
		File file = new File(dirPath+File.separator+"ok.mp3");
		if(!file.isFile()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("���ϻ����Ϸ�");
		}
	}
}
