package step4;

abstract class Parent{
	public void eat() {
		System.out.println("��Դ�");
	}
	//abstract method - abstract class!
	public abstract void study();
}

//�����ϰų� Child�� abstract�� ����ǰų�
//abstract -> implement
class Child extends Parent{
	public void study() {
		System.out.println("hello study");
	}
}

abstract class Child2 extends Parent{
	//Child2�� abstract classȭ�Ͽ� implement���� �ʾƵ� �� ���
}

public class TestAbstract2 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.study();
	}
}
