package step5;

public class Employee {
	private String empNo;
	private String empName;
	private int salary;
	public Employee(String empNo, String empName, int salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	
	public String toString() {
		return "empNo: "+empNo+" empName: "+empName+" salary: "+salary;
	} //���� service���� �ش� ��ü�� ȣ���Ͽ��� String�� return, �ſ� ����
}
