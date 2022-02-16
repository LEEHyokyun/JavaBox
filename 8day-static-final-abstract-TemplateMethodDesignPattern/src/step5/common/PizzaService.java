package step5.common;

public abstract class PizzaService {
	//ù��° common ����
	//��ӹ��� �ڽĿ� ���ؼ��� ����� �� �ֵ��� protected ������ ����
	protected void prepare() {
		System.out.println("���츦 ��������ϴ�");
	}
	protected abstract void topping(); //�ش� ����� �ڽ� Ŭ�������� ���� 
	//������ ���� �ʿ�!
	protected void bake() {
		System.out.println("���ڸ� �������ϴ�");
	}
	protected void cutting() {
		System.out.println("���ڸ� �߶����ϴ�");
	}
	protected void boxing() {
		System.out.println("�ϼ��� ���ڸ� �����Ͽ����ϴ�");
	}
	//template method!
	public void makePizza() {
		//���������� ����ϱ� ���� "��ǥ" "�ϰ�ȭ��" method
		prepare();
		topping();
		bake();
		cutting();
		boxing();
	}
}
