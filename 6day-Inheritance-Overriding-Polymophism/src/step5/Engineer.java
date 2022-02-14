package step5;

public class Engineer extends Employee{
	private String skills;
	
	public Engineer(String empNo, String empName, int salary, String skills) {
		super(empNo, empName, salary);
		this.skills = skills;
	}
	
	public String getDetails() {
		return super.getDetails() + " skills´Â "+ skills;
	}
	
	public String getSkill() {
		return skills;
	}
}
