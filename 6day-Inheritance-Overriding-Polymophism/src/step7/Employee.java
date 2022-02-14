package step7;

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
		return "empNo: "+empNo+" "+"empName: "+empName+" "+"Salary: "+salary;
	}
	
	public String getEmpNo() {
		return empNo;
	}
}
