package step2;
//������ .. ����� ���� "�����ϴ�" main method
//��ɵ��� ������ class�� ����
public class TestPerson {
	//JVM�� ���� ���������� �������� main method(starting point!)
	//class�� ������ �޸𸮿� �÷��� ��ü�� ������ �� �ֵ��� ��
	public static void main(String[] args) {
		System.out.println("main ����");
		//Person class�� �̿��Ͽ� Person "��ü" ����
		Person p = new Person();
		//new ������, p��� ������ ������Ų��(�޸�, heap).
		//��ü�� ����� ������ ��(��ü>�ش� ��ü�� name����)
		System.out.println(p.name);
		//��ü�� �޼ҵ带 ȣ��(��ü>�ش� ��ü�� �޼ҵ�����)
		p.eat();
		System.out.println("main ����");
	}
}
