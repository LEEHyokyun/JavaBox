package step3;

public class Car {
	private String model;
	private Engine engine;
	
	public Car(String model) {
		this.model = model;
		//composition
		//Car ��ü�� �����ϴ� ��������, engine Ŭ����(�� Engine data type�� ��ü�� �����ڷ� ���� ����)���� �����Ѵ�.
		//�� class�� engine ���������� �����Ѵ�.
		//�� Car ��ü�� ����ٸ� ������ engine ��ü�� �����ȴ�.
		this.engine = new Engine("�ͺ�",2000);
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
