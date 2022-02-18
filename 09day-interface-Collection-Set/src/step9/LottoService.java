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
			/*
			 * for 사용은 말 그대로 "순회"
			 * Random nextInt() 메서드로 임의의 수 발생 > 동일한 정수정보가 나올 수 있기 때문
			 * 따라서 6번의 순회동안 다른 정수정보가 누락되어 도출조건에 부합하지 않을수도 있음
			 * 즉 그냥 조건없이 6번 순회하므로, 정수중복시 size 6이 안될 수도 있음
			 */
			/*
			 * 따라서 size가 6이 될때까지 반복
			 */
			set.add(r.nextInt(45)+1);
			//r.nextInt(45)-> 0~44 여기에 +1
		}
		return set;
	}
}
