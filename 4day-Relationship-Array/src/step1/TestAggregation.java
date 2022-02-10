package step1;
//has a relationship
//customer has a smartphone
public class TestAggregation {
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("������", 100);
		Customer c = new Customer();
		
		c.setName("������");
		c.setSmartPhone(s);
		
		System.out.println(c.getName());
		System.out.println(c.getSmartPhone());
		//������ ���� ������ ����Ʈ�� ��ü�� ����
		//�⺻������ �ش� �ּҰ��� ������ �� �����Ƿ�, �������� �޼ҵ忡 ���ٰ���
		System.out.println(c.getSmartPhone().getModel());
	
		//setSmartPhone�� �Ű������� ���޵Ǵ� ��ü��
		//�⺻������ ���������� ������ dataType�� �Բ�, ��ü �Ӽ� ���� �ݵ�� ��ġ�ؾ� �Ѵ�.
		//�������ν�� SmartPhone ��ü�� ���� ����������, ����� ������ Ȱ���Ѵٸ� �ٸ� ��ü�� ������ ���� �ְ� �ȴ�.
		
		//������ ���� ����Ʈ�� ������ 200���� ����
		c.getSmartPhone().setPrice(200);
		System.out.println(c.getSmartPhone().getPrice());
	}
}
