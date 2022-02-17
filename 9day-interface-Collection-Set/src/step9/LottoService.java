package step9;

import java.util.TreeSet;
import java.util.Random;

public class LottoService {
	/*
	 *  1~45까지 중복되지 않은 정수 6개가 set에 저장되어 return
	 */
	public TreeSet<Integer> createLotto(){
		TreeSet<Integer> set = new TreeSet<Integer>();	
		Random r = new Random();
		
		while(set.size()<6) {
			set.add(r.nextInt(45)+1);
			//r.nextInt(45)-> 0~44 여기에 +1
		}
		return set;
	}
}
