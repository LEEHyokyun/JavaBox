package step2;

public class Test2DArray {
	public static void main(String[] args) {
		//2���� �迭
		int rain[][] = new int[3][12];
		System.out.println(rain[0]); //1���� �迭��ü�� ����Ű�� �迭��ü�� �ּҰ�
		System.out.println(rain[0][0]); //1��1���� �迭��ü�� �Ҵ�� ��
		System.out.println(rain[0].length);
		rain[0][0] = 100; //�迭�� �Ҵ�, �Ҵ���� ���� ��� �⺻�ʱ�ȭ(0)
		
		//�� �� �׸��� �������� ���� ���
		int[][] school = new int[3][];
		//�� �� ���� ���� �迭�� �Ҵ����ش�.
		school[0] = new int[3];
		school[1] = new int[5];
		school[2] = new int[8];
		
		//������б� ������ �г��� ������ �ݿ� 20���� �Ҵ�
		//�Ҵ� �� �ε��� ����
		school[2][7] = 20;
		int i = school.length-1; //2
		int j = school[i].length-1; //2;
		System.out.println(school[2][7]);
	}
}
