package step1;
/*
 * Throwable class�� �ڽ�(sub) class��
 * Error, Exception�� �����Ѵ�.
 */
/*
 * throw Throwable -> error, exception ��� ����!
 */
//customized Exception
class ErrorDemo{
	public void go() {
		System.out.println("go");
		stop();
	}
	public void stop() {
		System.out.println("stop");
		go();
	}
}
public class TestError {
	public static void main(String[] args) {
		ErrorDemo e = new ErrorDemo();
		e.go();
	}
}
