package step01;
/*
 *  main thread�� ���� = �ϳ��� ���μ����� ����
 */
class SingleThreadTest{
	public void test() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread in processing: "+i);
		}
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		SingleThreadTest t = new SingleThreadTest();
		t.test();
		/*
		 * main ���� ������ .. ���� ������ �Ұ����� ����
		 */
		System.out.println("main thread�� ����Ǿ����ϴ�.");
	}
}
