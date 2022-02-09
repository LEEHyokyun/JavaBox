package step9;

public class RentCar {
	private String model;
	private String name;
	
	public RentCar(String model, String name) {
		super(); 
		this.model = model;
		this.name = name;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
