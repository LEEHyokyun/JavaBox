package step9;

public class Mydate {
	private int month = -1;
	
	public Mydate(int month) {
		//������ �˰��� �κ���(���ǹ� ��)
		//server side���� �ۼ����ִ� ���� ����.
		if(month > 0 && month <13) {
			this.month = month;
		} else {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
		}
	}
	
	public int getMonth() {
		return month;
	}
	
}
