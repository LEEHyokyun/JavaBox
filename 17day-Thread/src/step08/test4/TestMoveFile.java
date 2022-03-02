package step08.test4;

import java.io.File;

public class TestMoveFile {
	public static void main(String[] args) {
		String orgPath = "C:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test"+File.separator+"ok.mp3";
		String destPath = "C:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test2"+File.separator+"ok.mp3";
		
		File orgFile = new File(orgPath);
		File destFile = new File(destPath);
		File destDir = destFile.getParentFile();
		if(!destDir.isDirectory()) {
			destDir.mkdirs();
		}
		//������ ������ �̸��� �����ϸ鼭 ��α��� �̵���Ų��.
		orgFile.renameTo(destFile);
	}
}
