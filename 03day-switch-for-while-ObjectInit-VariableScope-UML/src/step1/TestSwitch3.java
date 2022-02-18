package step1;

public class TestSwitch3 {
	public static void main(String[] args) {
		DateService service = new DateService();
		service.printLastDay(2); 
		service.printLastDay(12);
		service.printLastDay(14);
	}
}
