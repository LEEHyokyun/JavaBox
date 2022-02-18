package step3;

public class Manager extends Employee{
	/*
	 * sub class에서 생성자를 명시하지 않는다면 Manager(){super();}
	 * 와 같이 매개변수가 없는 기본생성자 호출시도
	 * 부모생성자는 기본생성자가 없으므로 컴파일 에러.
	 */
	private String department;
	//super 명기필요
	public Manager(String empNo, String empName, int salary, String department) {
		//부모생성자 명기
		super(empNo, empName, salary);
		//자식 고유의 인스턴스 변수 초기화
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
