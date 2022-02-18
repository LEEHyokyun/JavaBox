package step7;

public class TestReferenceType {
	public static void main(String[] args) {
		/*
		 * Product : 참조형 type
		 * Product type에 맞게 생성된, heap에 올려진 객체를 참조하는 참조변수 p
		 */
		Product p = new Product("토마토","해태",3000);
		System.out.println(p.getName());
		//아래 객체를 생성한 후
		//주소값을 할당(메모리 적재) 후 참조변수가 이를 참조
	
		//상품객체를 하나 더 생성
		Product p2 = new Product("카스","두산",5000);
		//p 참조변수가 참조하는 객체 주소값을 
		//p2 참조변수에 다시 할당, 즉 참조하게 되는 것
		p2 = p;
		System.out.println(p2.getName());
	}
}
