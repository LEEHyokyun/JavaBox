package step1;

public class Customer {
	private String name;
	//aggregation, has a
	private SmartPhone smartPhone; //instance variable로 객체를 참조하는 참조변수 생성
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//smartPhone 객체의 주소값을 return
	//DataType은 이에 대한 type형으로 정의
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	
	//매개변수 smartPhone 객체를 전달
	//datatype이 일치해야 한다! 변수명은 중요치 않으나, 혼동하지 않기 위해 같이 사용하는 것!
	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	
}
