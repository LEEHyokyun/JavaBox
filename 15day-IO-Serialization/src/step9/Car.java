package step9;

import java.io.Serializable;

public class Car implements Serializable {
	//해당 객체는 이후 외부 파일로 직렬화된다.
	private static final long serialVersionUID = 1L;
	private String model;
	private int price;

	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
