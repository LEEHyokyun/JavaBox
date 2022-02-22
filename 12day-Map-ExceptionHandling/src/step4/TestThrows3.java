package step4;
/*
 * Unchecked Exception : 별도의 throws 없이도 전파
 * Runtime / 하위 Exception
 */
public class TestThrows3 {
	//case 1 - NullPointerException
	public static void main(String[] args) {
		NameService service = new NameService();
		try{
			service.printMessage("장범준");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
