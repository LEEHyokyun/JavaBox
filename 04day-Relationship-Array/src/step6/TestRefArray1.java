package step6;

public class TestRefArray1 {
	public static void main(String[] args) {
		//참조형 데이터(객체)를 요소로 저장하는 배열
		//배열 선언
		Person[] pa;
		//배열 생성
		pa = new Person[3];
		System.out.println(pa[0]);
		//배열 요소 할당(할당전에는 null)
		//객체 생성하듯이 할당해주면 된다.
		pa[0] = new Person("아이유",30);
		pa[1] = new Person("박보검",28);
		pa[2] = new Person("RM", 28);
		
		for(int i=0;i<pa.length;i++) {
			System.out.println(pa[i].getName());
		}
	}
}
