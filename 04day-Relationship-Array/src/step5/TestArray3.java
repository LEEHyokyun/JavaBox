package step5;

public class TestArray3 {
	public static void main(String[] args) {
		//�迭 ����, ����, �Ҵ�
		int[] array = {700,200,400,900,1000};
		System.out.println(array[2]);
		
		int num=500;
		//num�� �ʰ��ϴ� ��ҵ鸸 ���
		for(int i=0;i<array.length;i++){
			if(array[i] > num) {
				System.out.println(array[i]);
			}
		}
	}
}
