package step4;

class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}

class rabbit extends Animal{
	//method overriding
	public void eat() {
		System.out.println("ä���ϴ�");
		
		//�θ��� method���� ȣ���� �� �ִ�(suepr�̿�)
		super.eat();
	}
}

public class TestOverriding {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		
		//overriding�� �޼ҵ带 ȣ���Ѵ�.
		rabbit r = new rabbit();
		r.eat();
	}
}

// �Ű������� �޶����ٸ� �޼ҵ���� �����ص�, �ܼ��� �޼ҵ���� ������ "�ٸ� �޼ҵ�"�� ȣ���ϴ� ��.
//�������̵��� �����ϱ� ���ؼ� �޼ҵ��, �Ű�����, return �� ��� �ݵ�� �����ؾ� �Ѵ�.
//���������ڴ� �θ� �޼ҵ忡�� �������� �ȵȴ�(�о����� ������ �����ϴ�).
	