package step5;

import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = -128739812739L;
	/*
	 * ����ȭ ������ ������
	 * ���� ������� �ʴ´ٸ� �����Ͽ� ���� �������� �ٸ��� �����ȴ�.
	 * ��ó�� ���� ���� ��⸦ ���ִ� ������� ����(�̸� ����)
	 * ������ȭ�� �������� Ȯ���Ͽ� �����ϴ� ��
	 */
	private String name;
	private String address;
	private int money;

	public Person(String name, String address, int money) {
		super();
		this.name = name;
		this.address = address;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
