package step9;

import java.util.TreeSet;

/*
 *  lotto number 1~45 : �ߺ����� ���� ������ 6�� ���ĵǾ� ǥ���ȴ�.
 *  Collection �ڷᱸ�� �� TreeSet<Integer> Ȱ���Ѵ�!
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
