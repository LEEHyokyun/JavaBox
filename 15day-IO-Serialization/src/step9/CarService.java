package step9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import common.Path;

public class CarService {
	private String path = Path.TEST_PATH + "carlist.obj";
	// ArrayList는 Serializable이 imple된 상태로, 별도 implements Serializable 필요X
	// 다만 Car class 자체에 대해서는 Serializable 해야한다.
	private ArrayList<Car> list = new ArrayList<Car>();

	public void addCar(Car car) {
		// list indexing
		list.add(car);
	}

	// 확인용
	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	public void saveList() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(list);
		} finally {
			if (oos != null)
				oos.close();
		}
	}

	public ArrayList<Car> loadList() throws ClassNotFoundException, IOException {
		ArrayList<Car> list = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		/*
		 * keypoint : list 형식으로 다운캐스팅하여 객체 받아오기
		 */
		try {
			list = (ArrayList<Car>) ois.readObject();
		} finally {
			if (ois != null)
				ois.close();
		}
		return list;
	}

}
