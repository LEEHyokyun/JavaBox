package step8;
//first super object created, after sub object created.
//after all, reference variable refers it.

//java.lang not needed to be called.

class Parent{
	public Parent() {
		System.out.println("Parent ��ü ����");
	}
}

class Child extends Parent{
	public Child(){
		super(); //super�� �ݵ�� �ڽ� ��ü�� first statement
		//extends�� �⺻������ �θ������ ȣ���� super() Ű���尡 ȣ��ȴ�.
		//super() //�θ������ ������� �ʾƵ� �⺻������ ����Ǵ� Ű����
		System.out.println("Child ��ü ����");
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}
