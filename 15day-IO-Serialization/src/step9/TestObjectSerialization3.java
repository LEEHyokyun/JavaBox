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
			System.out.println("자동차 리스트를 직렬화하여 파일로 저장하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
