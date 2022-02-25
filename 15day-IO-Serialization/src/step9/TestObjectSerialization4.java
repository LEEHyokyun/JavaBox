package step9;

import java.io.IOException;
import java.util.ArrayList;

public class TestObjectSerialization4 {
	public static void main(String[] args) {
		CarService service = new CarService();
		ArrayList<Car> list = null;
		try {
			list = service.loadList();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getModel()+"�� ������"+" "+list.get(i).getPrice()+"�Դϴ�.");
		}
	}
}
