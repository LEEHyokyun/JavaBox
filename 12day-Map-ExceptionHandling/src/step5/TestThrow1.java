package step5;
/*
 * Exception Handling : 	���ܻ�Ȳ �߻��� ��ó����� �����ϰ� �����ϴµ� �� ������ �ִ�.
 */
/*
 * ����ڰ� �����ϴ� Exception, Exception class�� ��ӹ޾� ����Ѵ�.
 */
public class TestThrow1 {
	public static void main(String[] args) {
		MovieService service = new MovieService();
		int age = 11;
		
		try{
			service.enter(age);
		}catch(AgeException e) {
			//e.printStackTrace();
			//exception���� �޽����� ���� ���
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷��� ���� ����Ǿ����ϴ�.");
	}
}
/*
 * ��ü���� 
 *  finally
 *  �� �Ŀ� throws
*/