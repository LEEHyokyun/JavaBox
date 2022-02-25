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
	// ArrayList�� Serializable�� imple�� ���·�, ���� implements Serializable �ʿ�X
	// �ٸ� Car class ��ü�� ���ؼ��� Serializable �ؾ��Ѵ�.
	private ArrayList<Car> list = new ArrayList<Car>();

	public void addCar(Car car) {
		// list indexing
		list.add(car);
	}

	// Ȯ�ο�
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
		 * keypoint : list �������� �ٿ�ĳ�����Ͽ� ��ü �޾ƿ���
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
