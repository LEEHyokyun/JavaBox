package step10;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;
	
	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		makeDir();
		try {
			makeFile();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	//create directory
	public void makeDir() {
		File makeDirectory = new File(CommonInfo.MAKE_PATH);
		if(!makeDirectory.isDirectory()) {
			makeDirectory.mkdirs();
		}
	}
	//create File
	public void makeFile() throws IOException, InterruptedException {
		for(int i=0;i<makeCount;i++) {
			String fileName = createMakeFileName(i);
			File file = new File(CommonInfo.MAKE_PATH+File.separator+fileName);
			
			if(!file.isFile()) {
				file.createNewFile();
				System.out.println("파일이름: "+fileName+"의 파일생성이 완료되었습니다.");
			}
			Thread.sleep(makePeriod);
		}
		
	}
	
	public String createMakeFileName(int num) {
		String fileName = num+"_"+System.currentTimeMillis();
		//return long
		Random r = new Random();
		if(r.nextBoolean()) {
			fileName = fileName+".avi";
		}
		else {
			fileName = fileName+".mp3";
		}
		return fileName;
		
	}
}
