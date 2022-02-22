package step4;

public class NameService {

	public void printMessage(String name) {
		String info = name.concat(" 가수");
		/*
		 * name = null일 경우, Runtime 계열의 NullPointerException 발생
		 * 이때 unchecked exception으로, 별도 throw를 명시해주지 않아도 자동적으로 해당 메소드를 호출한 클래스에 throw한다.
		 * main에서 try/catch해주지 않는다면, 자동적으로 main은 JVM에게 throw한다.
		 */
		System.out.println(info);
	}

}
