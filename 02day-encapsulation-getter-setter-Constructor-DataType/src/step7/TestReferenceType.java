package step7;

public class TestReferenceType {
	public static void main(String[] args) {
		/*
		 * Product : ������ type
		 * Product type�� �°� ������, heap�� �÷��� ��ü�� �����ϴ� �������� p
		 */
		Product p = new Product("�丶��","����",3000);
		System.out.println(p.getName());
		//�Ʒ� ��ü�� ������ ��
		//�ּҰ��� �Ҵ�(�޸� ����) �� ���������� �̸� ����
	
		//��ǰ��ü�� �ϳ� �� ����
		Product p2 = new Product("ī��","�λ�",5000);
		//p ���������� �����ϴ� ��ü �ּҰ��� 
		//p2 ���������� �ٽ� �Ҵ�, �� �����ϰ� �Ǵ� ��
		p2 = p;
		System.out.println(p2.getName());
	}
}
