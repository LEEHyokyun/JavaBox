package step9;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	//Person�� RenCar�� �Ͻ������� ����Ѵ�(association)
	public void tour() {
		/*
		 * RentCar - Reference type
		 * car - ��������, tour method���� ����ϴ� ��������
		 */
		RentCar car = new RentCar("�׽���", "Hello");
		System.out.println(name+"�� "+car.getModel()+"�� "+car.getName()+"����մϴ�.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
