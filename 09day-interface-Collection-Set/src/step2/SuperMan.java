package step2;

import step1.Flyer;

public class SuperMan implements Flyer, Fighter{

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("superman is fighting");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("superman is flying");
	}
	//�� Flyer, Fighter interface�� ��� abstract method�� ����!
}
