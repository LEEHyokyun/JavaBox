package step4;
/*
 * Unchecked Exception : ������ throws ���̵� ����
 * Runtime / ���� Exception
 */
public class TestThrows3 {
	//case 1 - NullPointerException
	public static void main(String[] args) {
		NameService service = new NameService();
		try{
			service.printMessage("�����");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
