package step5;

public class TestArray1 {
	public static void main(String[] args) {
		//배열 선언
		int[] age;
		//배열 생성
		age = new int[5];
		System.out.println(age);
		System.out.println(age.length);
		System.out.println(age[0]);
		//값 할당
		age[0] = 1;
		age[1] = 2;
		age[2] = 3;
		System.out.println(age[2]);
		
		//for loop를 이용한 출력
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
	}
}
