package step3;

public class MyDate {
	private int day;
	
	public MyDate(int day) throws DayException{
		if(day<1 || day>31) {
			throw new DayException(day+"��(��) �߸��� �Է°��Դϴ�.");
		}
		this.day = day;
	}
	
	public int getDay(){
		return day;
		/*
		if(day == 0) {
			throw new DayException(day+"��(��) �߸��� �Է°��Դϴ�.");
		}else {
			return day;
		}
		*/
	}
}