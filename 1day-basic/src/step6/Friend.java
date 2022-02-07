package step6;

public class Friend {

		public void eat() {
			System.out.println("먹다!");
		}
		
		//매개변수를 받다
		public void eat2(String food) {
			System.out.println(food+"를 먹다.");
		}
		
		//매개변수를 받다
		public void eat3(String food, int count) {
			System.out.println(food+ " "+ count + "인분을 먹다");
		}
		
		//매개변수를 받다
		public String eat4() {
			String food = "치맥";
			return food;
		}
		
		//
}
