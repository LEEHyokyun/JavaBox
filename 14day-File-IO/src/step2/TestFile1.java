package step2;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) {
		//java.io.File
		String path = "C:"+File.separator+"kosta238";
		//File.separator -> 구분자, \
		File dir = new File(path); //File "객체"
		System.out.println(dir.exists()); //디렉토리가 존재하는지, 즉 해당 파일 경로가 존재하는지 확인
		System.out.println(dir.isDirectory()); //디렉토리라면 true
		System.out.println(dir.isFile()); //파일이면 true
		System.out.println(dir.getPath()); //path정보
		
		/*
		 * 새로운 디렉토리에 대한 File 객체를 만들고
		 * 해당 경로가 존재하지 않는다면 실제 디렉토리를 생성한다.
		 */
		File dir2 = new File(dir.getPath()+File.separator+"iotest");
		System.out.println(dir2.exists());
		if(!dir2.exists()) {
			boolean result = dir2.mkdir(); //디렉토리 생성 및 생성여부를 반환
			System.out.println("디렉토리 생성 여부: "+result);
		}
		
		/*
		 * 하위 디렉토리까지 생성할 경우
		 */
		
		//1. 기존 디렉토리로부터 상위 디렉토리를 얻어올 경우
		File pd = dir2.getParentFile();
		System.out.println("신규 생성한 디렉토리의 상위 디렉토리는"+pd);
		//2. 하위디렉토리 생성
		File dir3 = new File(pd.getPath()+File.separator+"iotest2"+File.separator+"music");
		//3. 디렉토리가 여러개(구분자가 여러개)일 경우엔, mkdirs();
		dir3.mkdirs();
		
		/*
		 * 위에서 생성한 디렉토리에 파일을 생성할때
		 */
		//1. file 객체 생성 및 경로 설정
		File file = new File(dir3.getPath()+File.separator+"readme.txt");
		//2. createNewFile - 예외처리 반드시 필수(try-catch or throws)
		try{
			System.out.println("파일생성여부? "+file.createNewFile());
			//file 객체에서 설정한 경로가 존재하지 않을 경우, 예외상황이 여기서 발생
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 특정 디렉토리 내의 모든 디렉토리명과 파일명을 출력하고자 할 때
		 * list화 및 for 반복을 통한 출력
		 */
		System.out.println(dir.getPath());
		String list[] = dir.list();
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		System.out.println("프로그램이 정상적으로 실행되었습니다.");
		
		/*
		 * 디렉토리와 파일을 구분해서 출력할 경우
		 */
		//java.io.File의 listFiles 이용(File객체반환)
		File[] list2 = dir.listFiles(); //list화
		for(int i=0;i<list2.length;i++) {
			File f = list2[i];
			//각 list 요소들을 반복순환하면서
			//isDirectory / isFile 확인 후 조건별 출력
			if(f.isDirectory()) {
				System.out.println("directroy: "+f.getName());
			}else if(f.isFile()) {
				System.out.println("File: "+f.getName());
			}
		}
	}
}
