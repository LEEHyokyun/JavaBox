package step1;

public class TestInterface1 {
	public static void main(String[] args) {
		System.out.println(Flyer.ID);
		//ID�� ����̹Ƿ� ���Ҵ�Ұ�, ����ϱ⸸ �ؾ���
		Flyer f1 = new Bird();
		//Datatype - interface, Object - �ڽİ�ü
		f1.fly(); 
		//�ڽİ�ü�� �������̵��� �޼ҵ� ȣ��, �� ��üȭ�� �޼ҵ带 ȣ��!
		Flyer f2 = new AirPlane();
		f2.fly();
		//������ ������� ��ü�� ����
	}
}
