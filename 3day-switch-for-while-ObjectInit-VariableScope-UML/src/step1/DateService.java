package step1;

public class DateService {
	/*
	 *  4,6,9,11월의 마지막은 30일
	 *  1,3,5,7,8,10,12월의 마지막은 31일
	 *  2월의 마지막은 28일
	 *  	
	 */

	
	public void printLastDay(int month) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			this.showInfo(month, 31);
			break;
		
		case 4: case 6: case 9: case 11:
			showInfo(month, 30);
			break;
			
		case 2:
			showInfo(month, 28);
			break;
		
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	private void showInfo(int m, int d) {
		System.out.println(m+"월의 마지막 일은 "+d+"입니다.");
	}
}
