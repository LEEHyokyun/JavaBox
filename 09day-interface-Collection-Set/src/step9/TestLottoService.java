package step9;

import java.util.TreeSet;

/*
 *  lotto number 1~45 : 중복되지 않은 정수가 6개 정렬되어 표현된다.
 *  Collection 자료구조 중 TreeSet<Integer> 활용한다!
 */
public class TestLottoService {
	public static void main(String[] args) {
		LottoService service = new LottoService();
		
		for(int i=0;i<5;i++) {
			TreeSet<Integer> set = service.createLotto();
			System.out.println("Lotto numbers: "+set);
			//return set with numbers		
		}
	}
}
