package step5;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e = new Employee("1","아이유",300);
		System.out.println(e.getDetails());
		
		Manager m = new Manager("2","박보검",400,"연구개발");
		//getDetail is over-rided.
		System.out.println(m.getDetails());
		
		Engineer en = new Engineer("3","강하늘",800,"자바");
		System.out.println(en.getDetails());
	}
}
