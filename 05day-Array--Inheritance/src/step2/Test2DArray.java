package step2;

public class Test2DArray {
	public static void main(String[] args) {
		//2차원 배열
		int rain[][] = new int[3][12];
		System.out.println(rain[0]); //1행의 배열객체가 가르키는 배열객체의 주소값
		System.out.println(rain[0][0]); //1행1열의 배열객체에 할당된 값
		System.out.println(rain[0].length);
		rain[0][0] = 100; //배열값 할당, 할당되지 않을 경우 기본초기화(0)
		
		//각 행 항목이 정해지지 않은 경우
		int[][] school = new int[3][];
		//각 행 별로 따로 배열을 할당해준다.
		school[0] = new int[3];
		school[1] = new int[5];
		school[2] = new int[8];
		
		//경기중학교 마지막 학년의 마지막 반에 20명을 할당
		//할당 시 인덱스 유의
		school[2][7] = 20;
		int i = school.length-1; //2
		int j = school[i].length-1; //2;
		System.out.println(school[2][7]);
	}
}
