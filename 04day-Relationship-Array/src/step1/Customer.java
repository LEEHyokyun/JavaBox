package step1;

public class Customer {
	private String name;
	//aggregation, has a
	private SmartPhone smartPhone; //instance variable�� ��ü�� �����ϴ� �������� ����
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//smartPhone ��ü�� �ּҰ��� return
	//DataType�� �̿� ���� type������ ����
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	
	//�Ű����� smartPhone ��ü�� ����
	//datatype�� ��ġ�ؾ� �Ѵ�! �������� �߿�ġ ������, ȥ������ �ʱ� ���� ���� ����ϴ� ��!
	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	
}
