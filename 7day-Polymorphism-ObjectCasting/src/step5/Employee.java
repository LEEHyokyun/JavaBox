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
	} //이후 service에서 해당 객체만 호출하여도 String이 return, 매우 간편
}
