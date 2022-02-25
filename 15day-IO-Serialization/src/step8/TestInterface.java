package step8;

interface Flyer {
}

class Bird implements Flyer {

}

class Eagle extends Bird {
}

public class TestInterface {
/*
 * Eagle -> Bird -> Flyer
 */
	public static void main(String[] args) {
		Flyer f1 = new Bird(); //OK
		Flyer f2 = new Eagle();
		/*
		 * ���� ���������� �ִٸ� instanceof �ڽ�Ŭ���� Ȥ�� Datatype(�θ�Ŭ���� Ȥ�� �������̽�) ��� ����
		 */
		System.out.println(f1 instanceof Flyer);
		System.out.println(f2 instanceof Flyer);
		//���� ������������ implement �Ͽ��ٸ�
		//�ڽ� Ŭ���������� ������ implement�� �ʿ䰡 ����.
		//�� java.io.serialzable interface imple�ϸ�, �ڽ� Ŭ������ ������ imple �� �ʿ䰡 ����.
		
		/*
		 *  ���� - �θ� interface�� imple�Ѵٸ�, �̸� ��ӹ��� �ڽ��� �� imple�� �ʿ�� ����.
		 *  serializable interface�� imple�� �θ� �ڽ��� ��ӹ��� ���,
		 *  ����ȭ ������ Ư���� �ڽ��� �״�� �����ް�, �̸� ����ȭ�� �� �ִ�.
		 */
	}
}
