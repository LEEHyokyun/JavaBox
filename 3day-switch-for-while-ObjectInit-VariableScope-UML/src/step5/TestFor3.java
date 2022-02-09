package step5;

public class TestFor3 {
	public static void main(String[] args) {
		//Nested Loop(¡ﬂ√∏ for)
		System.out.println("æ∆");
		System.out.println();
		System.out.println("¿Ã");
		System.out.println("±§\t∆“");
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 */
		int row = 3;
		int col = 5;
		for(int i=0;i<row;i++) {
			System.out.println("");
			for(int j=0;j<col;j++) {
				System.out.print((j+1)+"\t");
			}
		}
	}
}
