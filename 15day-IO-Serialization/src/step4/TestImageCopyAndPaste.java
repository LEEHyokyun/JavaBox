package step4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import common.Path;

public class TestImageCopyAndPaste {
	public static void main(String[] args) {
		String copyPath = Path.TEST_PATH+"Thumbnail.png";
		//System.out.println(new File(copyPath).exists());
		String pastePath = Path.TEST_PATH2+"copied-Thumbnail.png";
		
		ImageService service = new ImageService(copyPath, pastePath);
		try {
			service.copyAndPasteImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
