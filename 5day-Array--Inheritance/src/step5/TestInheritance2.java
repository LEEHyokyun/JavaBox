package step5;

public class TestInheritance2 {
	public static void main(String[] args) {
		Person p = new Person();
		p.study(); //����
		p.eat(); //����
		//System.out.println(p.age); //���������ڰ� private�̹Ƿ� ���ٺҰ�!
		//��ӹ޾Ҵ��� class�� �ٸ��Ƿ� private member�� ���ٺҰ�
		
		/*
		 * �θ��� setter, getter Ȱ���ϸ� ���ٰ���
		 */
		p.setAge(11);
		p.getAge();
		//�θ��� public method�� �θ�ü�������� �ٷ� ��밡��!
		//�ٸ� private ���ؼ��� ���� ����� �Ұ���!
	}
}
