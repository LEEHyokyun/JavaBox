package step7;

import java.io.Serializable;

public class Account implements Serializable{
	/**
	 * ����ȭ �������� ���� �����ϴ� ���� �����Ѵ�.
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private transient String password;
	//transient > modifier, ����ȭ ��󿡼� �����Ѵ�(��, �ܺη� �������� �ʰڴٴ� �ǹ�)
	private int balance;

	public Account(String name, String password, int balance) {
		super();
		this.name = name;
		this.password = password;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
