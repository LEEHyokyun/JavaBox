package step10;

import java.io.File;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;
	
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}

	@Override
	public void run() {
		makeDirs();
		/*
		 * 7초간격으로 5번 이동실행
		 */
		for(int i=0;i<moveCount;i++) {
			try {
				Thread.sleep(movePeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			moveFiles();
			System.out.println("File을 이동하였습니다.");
		}
	}
	
	public void makeDirs() {
		File movieDir = new File(CommonInfo.MOVIE_PATH);
		if(!movieDir.isDirectory()) {
			movieDir.mkdirs();
		}
		File musicDir = new File(CommonInfo.MUSIC_PATH);
		if(!musicDir.isDirectory()) {
			musicDir.mkdirs();
		}
	}
	
	public void moveFiles() {
		//move file = renameTo
		File repositoryDir = new File(CommonInfo.MAKE_PATH);
		File[] files = repositoryDir.listFiles();
		for(int i=0;i<files.length;i++) {
			String name = files[i].getName(); //파일 확장자
			String destination = null;
			if(name.endsWith(".avi")) {
				destination = CommonInfo.MOVIE_PATH;
			}else if(name.endsWith(".mp3")) {
				destination = CommonInfo.MUSIC_PATH;
			}
			File destFile = new File(destination+File.separator+name);
			files[i].renameTo(destFile);
		}
	}
}
