package step3;

public class TestSuper5 {
	public static void main(String[] args) {
		Employee e = new Employee("22","아이유",500);
		System.out.println(e.getEmpNo()+" "+e.getEmpName()+" "+e.getSalary());
		
		Manager m = new Manager("2", "박보검", 700, "영업부");
		System.out.println(m.getEmpNo()+" "+m.getEmpName()+" "+m.getSalary());
	}
}
