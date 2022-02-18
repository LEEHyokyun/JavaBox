package step3;

public class TestComposition {
	public static void main(String[] args) {
		// composition
		// Engine consists of Car.
		Car c = new Car("grandeur");
		System.out.println(c.getModel());
	
		//c ��ü�� �����ϴ� Car ��ü�� ���� type�� ��ȯ�޾� ����Ѵ�.
		System.out.println(c.getEngine().getType());
		
		//c ��ü�� �����ϴ� Car ��ü�� ���� ��ⷮ�� 3000���� ����
		c.getEngine().setDisplacement(3000);
		// �� c ��ü(Car)�� �������� engine�� ���������� Engine ��ü�� ����(�� �ּҰ�)�ϹǷ� ������ �����̴�!!
		System.out.println(c.getEngine().getDisplacement());
		
		/*
		 * 1. Car datatype�� c ��ü ����
		 * 2. c ��ü �����ڰ� �����Ǹ鼭 model��, ���������� engine ��ü�����ڱ��� ȣ��
		 * 3. �����ڰ� dataType�� Engine, Engine dataType class�� �״�� �����ϰ�
		 * 4. �������� engine ���������� ��(��ü�� �ּҰ�) �����ϰ� �Ǹ� �׶� Car ������(�� ��ü) �����Ϸ�
		 * 5. �� ��ü�� Car�� ����Ű�� �� ���¿��� car ��ü���� �����Ϸ��
		 */
		
		//����) ��ü�������� : Engine > Car
	}
}
