package step5;

public class TestArray2 {
	public static void main(String[] args) {
		int[] salary = new int[4];
		salary[0] = 200;
		salary[1] = 500;
		salary[2] = 800;
		salary[3] = 1300;
		
		int totalSalary = 0;
		for(int i=0;i<salary.length;i++) {
			totalSalary = totalSalary + salary[i];
		}
		System.out.println("ÃÑ¾×Àº "+totalSalary);
	}
}
