package step1;

public class MyDate {
	//default ���� �����ڷ� �ܺ� Ŭ�������� ���� ����
	//�߸��� day value�� �Ҵ��� ���� �ִ�.
	int day;
	//private �̹Ƿ� �ܺ� Ŭ�������� ���� �Ұ�
	//private ���� �����ڷ� �ܺ� ���� �����Ͽ���
	private int encapsulDay;
	//enDay �ν��Ͻ� ������ ���� setter getter method�� �����Ͽ�
	//�ܺο����� setter, getter�� �̿��Ͽ� enDay �ν��Ͻ������� ���� �����ϵ��� ����
	
	//setter method
	public void setEncapsulDay(int d) {
		if(d>0 && d<32) {
			encapsulDay = d;
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
			encapsulDay = 1;
		}
	}
	//getter method
	public int getEncapsulDay() {
		return encapsulDay;
	}
	
}
