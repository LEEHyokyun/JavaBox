package step9;

import java.io.IOException;

public class TestObjectSerialization3 {
	public static void main(String[] args) {
		CarService service = new CarService();
		service.addCar(new Car("GRANDEUR", 4000));
		service.addCar(new Car("SM6", 2500));
		service.addCar(new Car("MORNING", 2000));
		service.printAll();
		try {
			service.saveList();
			System.out.println("�ڵ��� ����Ʈ�� ����ȭ�Ͽ� ���Ϸ� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
