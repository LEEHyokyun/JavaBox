package step5;

public class TestString {
	public static void main(String[] args) {
		String name = "������";
		System.out.println(name);
		System.out.println(name.concat("��"));
		System.out.println(name.contains("��"));
		System.out.println(name.indexOf("��"));
		
		String info = "������ �ð��̴�";
		System.out.println(info.substring(2));
		
		String id = "javaking";
		System.out.println(id.length()); //���� ���� ����
		System.out.println(id.trim().length());
		
		String fileName = "goods.item.web.mp3";
		System.out.println(fileName.lastIndexOf("."));
		//Ȯ���� ���Ҷ� Ȱ��
		/*
		 * lastIndexOf -> Ȯ���� ���Ҷ�
		 * replace -> Ȯ���� ������ �����̸�
		 */
	}
}
