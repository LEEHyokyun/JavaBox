package step7;

//다른 패키지에서 person class import 가능!
import step6.Person;

public class TestRefArray2 {
	public static void main(String[] args) {
		//배열 선언 생성 할당 동시에
		Person[] pa = {
				new Person("강하늘",34),
				new Person("박보검",28),
				new Person("유재석",50)
		};
		int age=30;
		//30을 초과하는 Person name , age를 출력
		for(int i=0;i<pa.length;i++) {
			if(pa[i].getAge()>30) {
				System.out.print(pa[i].getName() + "\t");
				System.out.print(pa[i].getAge());
				System.out.println();
			}
		}
		
	}
}
