package step7;

public class TestObject3toString {
	public static void main(String[] args) {
		Employee e = new Employee("1","������",400);
		System.out.println(e); //���������� toString ȣ��, �������̵�!
		
		Manager m = new Manager("2","�ں���",500,"���������");
		System.out.println(m);
		m.getEmpNo(); //���, �ڽİ�ü���� �θ� �޼��� ���!
	}
}
