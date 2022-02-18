package step9;

import java.util.TreeSet;
import java.util.Random;

public class LottoService {
	/*
	 *  1~45���� �ߺ����� ���� ���� 6���� set�� ����Ǿ� return
	 */
	public TreeSet<Integer> createLotto(){
		TreeSet<Integer> set = new TreeSet<Integer>();	
		Random r = new Random();
		
		while(set.size()<6) {
			/*
			 * for ����� �� �״�� "��ȸ"
			 * Random nextInt() �޼���� ������ �� �߻� > ������ ���������� ���� �� �ֱ� ����
			 * ���� 6���� ��ȸ���� �ٸ� ���������� �����Ǿ� �������ǿ� �������� �������� ����
			 * �� �׳� ���Ǿ��� 6�� ��ȸ�ϹǷ�, �����ߺ��� size 6�� �ȵ� ���� ����
			 */
			/*
			 * ���� size�� 6�� �ɶ����� �ݺ�
			 */
			set.add(r.nextInt(45)+1);
			//r.nextInt(45)-> 0~44 ���⿡ +1
		}
		return set;
	}
}
