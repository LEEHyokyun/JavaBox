package step8;

public class TestOperator {
	public static void main(String[] args) {
		//Java ������
		int i = 7;
		int j = 8;
		System.out.println(i*j);
		System.out.println(i%j);
		System.out.println(i==j);
		
		//����������
		int k = 10;
		System.out.println(k++); //������ ����
		System.out.println(k);
		System.out.println(++k); //������ ����
		System.out.println(k--); //������ ����
		System.out.println(--k); //������ ����
		
		//��������
		int money = 100;
		money+=100;
		money-=50;
		System.out.println(money);
		
		//���׿�����
		// (���ǽ�)? ��1:��2 - ���ǽ���  ���϶� ��1 ����, �����϶� ��2 ����
		int x = 10;
		int result = (x>0)? x+1:x-1;
		System.out.println(result);
		
		//and or ���� - &&, ||
		// && : false�� ������ ���� ���� ����, false ��ȯ
		// & : false�� �������� �׸��� ������ ���� ������ ����, �� ���Ŀ� false ��ȯ
	}
}
