package step5;

public class Engineer extends Employee{
	private String skill;
	public Engineer(String empNo, String empName, int salary, String skill) {
		super(empNo, empName, salary);
		this.skill = skill;
	}
	
	public String toString() {
		return super.toString() + " skill: "+skill;
	}
}
