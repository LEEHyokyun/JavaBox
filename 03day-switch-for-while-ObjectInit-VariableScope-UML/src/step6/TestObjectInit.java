package step6;

public class TestObjectInit {
	public static void main(String[] args) {
		Mydate date = new Mydate(29);
		
		System.out.println(date.getDay1()); //�⺻�ʱ�ȭ
		System.out.println(date.getDay2()); //�������ʱ�ȭ
		// + ����� �ʱ�ȭ
		
		System.out.println(date.isFlag()); //�⺻ �ʱ�ȭ(false)
		System.out.println(date.getName()); //�⺻ �ʱ�ȭ(null)
	}
}
