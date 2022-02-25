package step2;

import java.io.File;

public class FileService {

	public void printDirAndFile(String path) {
		// TODO Auto-generated method stub
		String parentPath = new File(path).getParentFile().getPath();
		File newFile = new File(parentPath);
		//File parentFilePath = file.getParentFile();
		//File newFile = new File(parentFilePath.getPath());
		
		File[] list2 = newFile.listFiles();
		
		for(int i=0;i<list2.length;i++) {
			if(list2[i].isDirectory()) {
				System.out.println("Directory: "+list2[i].getName());
			}else if(list2[i].isFile()) {
				System.out.println("File: "+list2[i].getName());
			}
		}
		
		
	}

}
