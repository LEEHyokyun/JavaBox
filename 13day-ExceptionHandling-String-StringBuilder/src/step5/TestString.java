package step5;

public class TestString {
	public static void main(String[] args) {
		String name = "아이유";
		System.out.println(name);
		System.out.println(name.concat("님"));
		System.out.println(name.contains("아"));
		System.out.println(name.indexOf("아"));
		
		String info = "마지막 시간이다";
		System.out.println(info.substring(2));
		
		String id = "javaking";
		System.out.println(id.length()); //양쪽 공란 포함
		System.out.println(id.trim().length());
		
		String fileName = "goods.item.web.mp3";
		System.out.println(fileName.lastIndexOf("."));
		//확장자 구할때 활용
		/*
		 * lastIndexOf -> 확장자 구할때
		 * replace -> 확장자 제외한 파일이름
		 */
	}
}
