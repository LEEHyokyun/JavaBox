package step3;

public class TestException4 {
	/*
	 * finally : exception �߻� ������ ������� �׻� �����Ѵ�.
	 */
	public static void main(String[] args) {
		//String age = "22";
		String age = "������";
		/*
		 * NumberFormatException
		 */
		System.out.println(age+1);
		try {
			int ageNum = Integer.parseInt(age); //Exception �߻�����
			System.out.println(ageNum); //��������
			/*
			 * Exception try ó���� �߻����������� �������� ��� �����ϵ���!
			 */
		}catch(NumberFormatException e){
			System.out.println(e);
		}finally {
			System.out.println("finally block");
		}
		
	}
}
