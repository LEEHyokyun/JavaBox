package step1;
//has a relationship
//customer has a smartphone
public class TestAggregation {
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone("갤럭시", 100);
		Customer c = new Customer();
		
		c.setName("아이유");
		c.setSmartPhone(s);
		
		System.out.println(c.getName());
		System.out.println(c.getSmartPhone());
		//아이유 고객이 보유한 스마트폰 객체에 접근
		//기본적으로 해당 주소값에 접근할 수 있으므로, 내부적인 메소드에 접근가능
		System.out.println(c.getSmartPhone().getModel());
	
		//setSmartPhone의 매개변수에 전달되는 객체는
		//기본적으로 내부적으로 생성된 dataType과 함께, 객체 속성 등이 반드시 일치해야 한다.
		//지금으로써는 SmartPhone 객체만 전달 가능하지만, 상속의 개념을 활용한다면 다른 객체도 전달할 수도 있게 된다.
		
		//아이유 고객의 스마트폰 가격을 200으로 변경
		c.getSmartPhone().setPrice(200);
		System.out.println(c.getSmartPhone().getPrice());
	}
}
