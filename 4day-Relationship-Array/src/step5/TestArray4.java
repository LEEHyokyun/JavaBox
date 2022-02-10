package step5;

public class TestArray4 {
	public static void main(String[] args) {
		//참고로 main 메서드의 인자들은 환경설정이나 cmd창에서
		//java step5.TestArray4 data 형식으로
		//인자전달이 가능하다.
		//main 메서드의 매개변수 배열을 이용해본다.
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
	}
}
