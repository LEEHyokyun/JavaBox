package step5;

import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = -128739812739L;
	/*
	 * 직렬화 버전의 고유값
	 * 직접 명시하지 않는다면 컴파일에 따라 고유값이 다르게 설정된다.
	 * 위처럼 직접 직접 명기를 해주는 방식으로 정의(이를 권장)
	 * 역직렬화시 고유값을 확인하여 복원하는 것
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
