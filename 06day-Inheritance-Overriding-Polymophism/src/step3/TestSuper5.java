package step3;

public class TestSuper5 {
	public static void main(String[] args) {
		Employee e = new Employee("22","������",500);
		System.out.println(e.getEmpNo()+" "+e.getEmpName()+" "+e.getSalary());
		
		Manager m = new Manager("2", "�ں���", 700, "������");
		System.out.println(m.getEmpNo()+" "+m.getEmpName()+" "+m.getSalary());
	}
}
