package step08.test5;

import java.io.File;

public class TestDirectory {
	public static void main(String[] args) {
		/*
		 * 특정 디렉토리에 존재하는 파일들을 확인
		 */
		String dirPath = "C:"+File.separator+"kosta238"+File.separator+"iotest"+File.separator+"test2";
		
		File dir = new File(dirPath);	
		File list[] = dir.listFiles();
		
		for(int i=0;i<list.length;i++) {
			String name = list[i].getName();
			if(name.endsWith(".txt")) {
				System.out.println("메모장 파일");
			}else if(name.endsWith(".mp3")) {
				System.out.println("음악 파일");
			}
		}
	}
}
