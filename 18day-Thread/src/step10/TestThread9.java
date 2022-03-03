package step10;
/*
 * multi thread
 * 
 * 1. MAKE_PATH�� 1�� ���� 30�� �ݺ��Ͽ�, 30���� ���� ����
 * 2. Ȯ���ں��� ������ �����Ͽ�, Ư�� ��ο� ������ �̵���Ų��.
 * 	�� 7�� �������� 5�� �ݺ�����
 */
/*
 * �⺻������ �ټ� �Ը� ū, �۾��� �����ϴ� 2���� ��Ƽ������ ȯ�濡�� ����!
 * ���� ���� ������, ���� �̵� ������
 */
public class TestThread9 {
	public static void main(String[] args) {
		int makeCount = 30;
		int makePeriod = 1000;
		int moveCount = 5;
		int movePeriod = 7000;
		
		MakeFileWorker makeWorker = new MakeFileWorker(makeCount, makePeriod);
		Thread t1 = new Thread(makeWorker);
		t1.start();
		
		MoveFileWorker moveWorker = new MoveFileWorker(moveCount, movePeriod);
		Thread t2 = new Thread(moveWorker);
		t2.start();
		
	}
}
