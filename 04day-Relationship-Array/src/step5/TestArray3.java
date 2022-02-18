package step5;

public class TestArray3 {
	public static void main(String[] args) {
		//배열 선언, 생성, 할당
		int[] array = {700,200,400,900,1000};
		System.out.println(array[2]);
		
		int num=500;
		//num을 초과하는 요소들만 출력
		for(int i=0;i<array.length;i++){
			if(array[i] > num) {
				System.out.println(array[i]);
			}
		}
	}
}
