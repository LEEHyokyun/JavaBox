package step5;

public class TestFor4 {
	public static void main(String[] args) {
		/*
		 * 2 * 1 = 2	2 * 2 = 4
		 * 3 * 1 = 3	3 * 2 = 6....
		 */
		for(int i=2;i<10;i++){
			for(int j=1;j<10;j++) {
				System.out.print(i+" * "+j+" = "+i*j+"\t");
			}
			System.out.println();
		}
	}
}
