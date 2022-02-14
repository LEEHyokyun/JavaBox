package step7;

public class Manager extends Employee{
	private String department;
	
	public Manager(String empNo, String empName, int salary, String department) {
		super(empNo, empName, salary);
		this.department = department;
	}
	
	public String toString() {
		return super.toString() + " department: "+ department;
	}
}
