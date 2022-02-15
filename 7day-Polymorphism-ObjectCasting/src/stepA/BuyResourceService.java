package stepA;

public class BuyResourceService {
	private Drink[] array;
	private int count = 0;
	
	public BuyResourceService(int length) {
		array = new Drink[length];
	}
	
	public void add(Drink d) {
		array[count] = d;
		count = count + 1;
	}
	
	public void printAll() {
		for(int i=0;i<count;i++) {
			System.out.println(array[i]);
		}
	
	}
}
