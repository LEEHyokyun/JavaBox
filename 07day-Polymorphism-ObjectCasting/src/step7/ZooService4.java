package step7;

import step4.Animal;

public class ZooService4 {
	public void playAll(Animal[] a) {
		for(int i=0;i<a.length;i++) {
			a[i].play();
			//play는 각 객체마다 overriding 되었다.
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
