package step6;
//toString 메소드를 오버라이딩하여 사용

class Food{
	String menu;
	int price;
	Food(String menu, int price){
		this.menu = menu;
		this.price = price;
	}
	//toString을 활용하여 해당 객체의 속성정보를 return
	public String toString() {
		return menu;
		}
	
}

public class TestObject2 {
	//point : 객체주소값이 아닌, 속성정보를 return 하는 방식
	public static void main(String[] args) {
		Food f = new Food("스파게티", 9000);
		System.out.println(f.toString());
		System.out.println(f);
		//f 호출시 내부적으로 toString 메소드 호출
		//해당 메소드는 오버라이딩하여 재정의하였음
		//return menu를 통해 해당 객체의 속성값을 return

	}
}
