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

		// bis, bos�� null�� ���¿��� close�ϸ� Nullpoint ���ܻ�Ȳ�� �߻��Ѵ�.
		// �̿� ����, �ݵ�� bis != null ������ �������ֵ��� �Ѵ�.
		try {
			int data = bis.read();
			while (data != -1) {
				bos.write(data); // ���
				data = bis.read(); // �̸� �� ����Ʈ�� �Է�
			}
		} finally {
			if (bis != null)
				bis.close();
			if (bos != null)
				bos.close();
		}
	}

}
