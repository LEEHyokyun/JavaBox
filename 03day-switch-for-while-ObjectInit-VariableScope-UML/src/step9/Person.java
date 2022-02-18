package step9;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	//Person은 RenCar를 일시적으로 사용한다(association)
	public void tour() {
		/*
		 * RentCar - Reference type
		 * car - 참조변수, tour method에서 사용하는 지역변수
		 */
		RentCar car = new RentCar("테슬라", "Hello");
		System.out.println(name+"은 "+car.getModel()+"을 "+car.getName()+"사용합니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
