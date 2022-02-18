package step1;

public class TestEncapsulation {

	public static void main(String[] args) {
		//Encapsulation
		MyDate date = new MyDate();
		date.day = 32; //invalid date
		System.out.println(date.day);
		//date.enDay = 32; //할당불가 
		
		date.setEncapsulDay(32);
		date.setEncapsulDay(31);
		System.out.println(date.getEncapsulDay());
	}

}
