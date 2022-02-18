package step3;

public class Manager extends Employee{
	/*
	 * sub class���� �����ڸ� ������� �ʴ´ٸ� Manager(){super();}
	 * �� ���� �Ű������� ���� �⺻������ ȣ��õ�
	 * �θ�����ڴ� �⺻�����ڰ� �����Ƿ� ������ ����.
	 */
	private String department;
	//super ����ʿ�
	public Manager(String empNo, String empName, int salary, String department) {
		//�θ������ ���
		super(empNo, empName, salary);
		//�ڽ� ������ �ν��Ͻ� ���� �ʱ�ȭ
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
