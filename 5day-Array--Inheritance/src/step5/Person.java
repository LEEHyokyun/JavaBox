package step5;

public class Person extends Animal{
	//super class(Animal) is generalized over Person
	public void study() {
		System.out.println("�����ϴ�");
		//�⺻������ ��ӹ޴���
		//���������� �θ� �ν��Ͻ� ����� ���� �Ұ�
		//�θ��� private ����, �޼��忡 ���� �Ұ�
		System.out.println(getAge());
		//�ٸ� ���� ���� �θ� class���� ����� age getter
		//��, �޼ҵ� ��ü�� �ٷ� ����� �����ϴ�(*������ �θ�ü �����ʿ����)
		//private �ν��Ͻ� ����� ���ؼ��� ���� ���� �Ұ�
	}
}
