package step1;

import java.io.File;
import java.io.IOException;

import common.Path;

public class TestReviewOutput {
	public static void main(String[] args) {
		//System.out.println(new File(Path.TEST_PATH + "order.txt").delete());

		ReviewOutputService service = new ReviewOutputService(Path.TEST_PATH + "order.txt");
		try {
			service.order();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 경로확인
		// File dir = new File(Path.TEST_PATH);
		// System.out.println(dir.exists());
	}
}
