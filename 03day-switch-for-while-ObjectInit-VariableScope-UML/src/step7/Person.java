package step7;

public class Person {
	private int money; //�ν��Ͻ� ���� - �⺻ �ʱ�ȭ 0
	public Person() {
		int i = 1; //������ ���ο��� ����� ������ ��������
	}
	public void test1() {
		int i = 5;//���������� �ݵ�� ����� �ʱ�ȭ �ʿ�
		System.out.println(money);
	}
	
	public void test2(int money) {
		System.out.println(money);
		System.out.println(this.money);
	}
	
	public void test3() {
		if(money < 1){ //money > �ν��Ͻ� ������ ����Ų��.
			int count = 1;
			System.out.println(count);
		}
		//System.out.println(count); //count�� if �������� ��밡���� ���������̴�.
	}
	
	public void test4() {
		int count = 0;
		if(money < 1) {
			count = 1;
		}
		System.out.println(count);
	}
	
	public void test5() {
		int i = 1;
	}
	
	public void test6() {
	}
}
