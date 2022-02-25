package step4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	private String copyPath;
	private String pastePath;

	public ImageService(String copyPath, String pastePath) {
		this.copyPath = copyPath;
		this.pastePath = pastePath;
	}

	public void copyAndPasteImage() throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(copyPath));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(pastePath));

		// bis, bos가 null인 상태에서 close하면 Nullpoint 예외상황이 발생한다.
		// 이에 따라, 반드시 bis != null 조건을 기재해주도록 한다.
		try {
			int data = bis.read();
			while (data != -1) {
				bos.write(data); // 출력
				data = bis.read(); // 이를 한 바이트씩 입력
			}
		} finally {
			if (bis != null)
				bis.close();
			if (bos != null)
				bos.close();
		}
	}

}
