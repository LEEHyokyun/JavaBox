package step5;

public class MovieService {

	public void enter(int age) throws AgeException{
		try{
			if(age < 19) { //Ư����Ȳ
		
			/*
			 * age < 19�� ��쿣 excpetion ����, �Ʒ� method ������ ������� �ʴ´�.
			 */
			throw new AgeException(age+"�� �̼����̹Ƿ� ��ȭ������ �Ұ����մϴ�");
			//throw ����� ���� exception
		}
		}finally{
			System.out.println("finally ������ ����Ǿ����ϴ�");
		}
		System.out.println("���������� ��ȭ�� ���� �� �ֽ��ϴ�.");
	}
	
}
