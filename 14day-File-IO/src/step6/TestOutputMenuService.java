package step6;

import java.io.File;
import java.io.IOException;

public class TestOutputMenuService {
	/*
	 * ����޴��� �ֹ��ϼ���: ������
	 * ������ �ֹ�
	 * ����޴��� �ֹ��ϼ���: �ܹ���
	 * �ܹ��� �ֹ�
	 * ����޴��� �ֹ��ϼ���: ����
	 * �ֹ��� �Ϸ�Ǿ����ϴ�
	 * 
	 * iotest\menu.txt�� ������ ����
	 */
	public static void main(String[] args) {
		String path = "C:" + File.separator + "kosta238" + File.separator + "iotest" + File.separator + "menu.txt";
		MenuService service = new MenuService(path);
		
		try {
			service.orderMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
