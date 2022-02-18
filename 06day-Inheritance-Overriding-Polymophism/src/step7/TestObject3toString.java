package step7;

public class TestObject3toString {
	public static void main(String[] args) {
		Employee e = new Employee("1","아이유",400);
		System.out.println(e); //내부적으로 toString 호출, 오버라이딩!
		
		Manager m = new Manager("2","박보검",500,"기술영업부");
		System.out.println(m);
		m.getEmpNo(); //상속, 자식객체에서 부모 메서드 사용!
	}
}
