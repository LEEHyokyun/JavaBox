package step5;

public class TestOverriding2 {
	public static void main(String[] args) {
		Employee e = new Employee("1","������",300);
		System.out.println(e.getDetails());
		
		Manager m = new Manager("2","�ں���",400,"��������");
		//getDetail is over-rided.
		System.out.println(m.getDetails());
		
		Engineer en = new Engineer("3","���ϴ�",800,"�ڹ�");
		System.out.println(en.getDetails());
	}
}
