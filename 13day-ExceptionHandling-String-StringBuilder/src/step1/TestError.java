package step1;
/*
 * Throwable class의 자식(sub) class는
 * Error, Exception이 존재한다.
 */
/*
 * throw Throwable -> error, exception 모두 전파!
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
