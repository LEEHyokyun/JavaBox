package step5;

public class TestFor2 {
	public static void main(String[] args) {
		ForLoopService service = new ForLoopService();
		
		String item = "water";
		int count = 10;
		
		//service.printInfo(item, count);
		int limit = 3;
		service.printInfo2(item, count, limit);
	}
}
