package step2;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) {
		//java.io.File
		String path = "C:"+File.separator+"kosta238";
		//File.separator -> ������, \
		File dir = new File(path); //File "��ü"
		System.out.println(dir.exists()); //���丮�� �����ϴ���, �� �ش� ���� ��ΰ� �����ϴ��� Ȯ��
		System.out.println(dir.isDirectory()); //���丮��� true
		System.out.println(dir.isFile()); //�����̸� true
		System.out.println(dir.getPath()); //path����
		
		/*
		 * ���ο� ���丮�� ���� File ��ü�� �����
		 * �ش� ��ΰ� �������� �ʴ´ٸ� ���� ���丮�� �����Ѵ�.
		 */
		File dir2 = new File(dir.getPath()+File.separator+"iotest");
		System.out.println(dir2.exists());
		if(!dir2.exists()) {
			boolean result = dir2.mkdir(); //���丮 ���� �� �������θ� ��ȯ
			System.out.println("���丮 ���� ����: "+result);
		}
		
		/*
		 * ���� ���丮���� ������ ���
		 */
		
		//1. ���� ���丮�κ��� ���� ���丮�� ���� ���
		File pd = dir2.getParentFile();
		System.out.println("�ű� ������ ���丮�� ���� ���丮��"+pd);
		//2. �������丮 ����
		File dir3 = new File(pd.getPath()+File.separator+"iotest2"+File.separator+"music");
		//3. ���丮�� ������(�����ڰ� ������)�� ��쿣, mkdirs();
		dir3.mkdirs();
		
		/*
		 * ������ ������ ���丮�� ������ �����Ҷ�
		 */
		//1. file ��ü ���� �� ��� ����
		File file = new File(dir3.getPath()+File.separator+"readme.txt");
		//2. createNewFile - ����ó�� �ݵ�� �ʼ�(try-catch or throws)
		try{
			System.out.println("���ϻ�������? "+file.createNewFile());
			//file ��ü���� ������ ��ΰ� �������� ���� ���, ���ܻ�Ȳ�� ���⼭ �߻�
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * Ư�� ���丮 ���� ��� ���丮��� ���ϸ��� ����ϰ��� �� ��
		 * listȭ �� for �ݺ��� ���� ���
		 */
		System.out.println(dir.getPath());
		String list[] = dir.list();
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
		/*
		 * ���丮�� ������ �����ؼ� ����� ���
		 */
		//java.io.File�� listFiles �̿�(File��ü��ȯ)
		File[] list2 = dir.listFiles(); //listȭ
		for(int i=0;i<list2.length;i++) {
			File f = list2[i];
			//�� list ��ҵ��� �ݺ���ȯ�ϸ鼭
			//isDirectory / isFile Ȯ�� �� ���Ǻ� ���
			if(f.isDirectory()) {
				System.out.println("directroy: "+f.getName());
			}else if(f.isFile()) {
				System.out.println("File: "+f.getName());
			}
		}
	}
}
