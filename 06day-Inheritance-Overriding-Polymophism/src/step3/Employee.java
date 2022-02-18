package step3;

public class Employee {
	private String empNo;
	private String empName;
	private int salary;
	
	public Employee(String empNo, String empName, int salary) {
		//Employee -> 부모, java.lang의 Object 객체를 생성한다.
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
