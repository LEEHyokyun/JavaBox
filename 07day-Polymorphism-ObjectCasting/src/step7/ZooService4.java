package step7;

import step4.Animal;

public class ZooService4 {
	public void playAll(Animal[] a) {
		for(int i=0;i<a.length;i++) {
			a[i].play();
			//play�� �� ��ü���� overriding �Ǿ���.
			/*	
			 * import step4.Person;
			 * 
			 * if(a[i] instanceof Person){
			 * 	((Person) a[i]).ticketing();
			 * }
			 */
		}
	}
}
