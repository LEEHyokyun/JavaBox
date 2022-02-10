package step3;

public class Car {
	private String model;
	private Engine engine;
	
	public Car(String model) {
		this.model = model;
		//composition
		//Car 객체를 생성하는 시점에서, engine 클래스(즉 Engine data type의 객체가 생성자로 인해 생성)까지 생성한다.
		//그 class를 engine 참조변수가 참조한다.
		//즉 Car 객체를 만든다면 무조건 engine 객체도 생성된다.
		this.engine = new Engine("터보",2000);
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
