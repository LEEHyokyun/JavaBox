//Package - 디렉토리별로 클래스를 분로하여 관리
package step2;
//클래스 정의
/*
 * public : 가장 넓은 범위의 "접근 제어자", 어디서나 접근이 가능하다.
 * class : class를 정의를 위한 키워드(예약어)
 * class name, 대문자로 시작
 */
public class Person {
	/*
	 * 변수(instance variable, 실재하는 값) - 객체의 속성(field)
	 * class variable은 아님(=static)
	 */
	String name = "아이유";
	/*
	 * 메소드(method) - 객체의 기능을 정의
	 */
	public void eat() {
		System.out.println(name+" 먹다");
	}
}

//객체지향언어는 별도의 부품, 기능별로 모듈화를 한다.
//application에서의 object를 생성하기 위한 틀이 class이다.