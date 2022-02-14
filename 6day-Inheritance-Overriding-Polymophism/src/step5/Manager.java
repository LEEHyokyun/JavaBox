package step5;

public class Manager extends Employee{
	private String department;

	public Manager(String empNo, String empName, int salary, String department) {
		super(empNo, empName, salary);
		this.department = department;
	}
	
	public String getDetails() {		
		return super.getDetails() + "추가적으로" + " department는 "+ department;
	}
	
}
