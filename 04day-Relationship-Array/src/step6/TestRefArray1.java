package step6;

public class TestRefArray1 {
	public static void main(String[] args) {
		//������ ������(��ü)�� ��ҷ� �����ϴ� �迭
		//�迭 ����
		Person[] pa;
		//�迭 ����
		pa = new Person[3];
		System.out.println(pa[0]);
		//�迭 ��� �Ҵ�(�Ҵ������� null)
		//��ü �����ϵ��� �Ҵ����ָ� �ȴ�.
		pa[0] = new Person("������",30);
		pa[1] = new Person("�ں���",28);
		pa[2] = new Person("RM", 28);
		
		for(int i=0;i<pa.length;i++) {
			System.out.println(pa[i].getName());
		}
	}
}
