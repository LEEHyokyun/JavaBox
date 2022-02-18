package step8;
//expect how attribute values would be aligned.
public class TestObjectInit2 {
	public static void main(String[] args) {
		Friend f = new Friend("아이유", 30);//기존 객체
		FriendService service = new FriendService();// 객체 전달 후 속성 변화
		service.test1(f); //객체가 인자를 통해 전달되었다.
		System.out.println(f.getName()+" "+f.getAge());
		service.test2(f);
		System.out.println(f.getName()+" "+f.getAge());
	}
}

//최초 생성자로 아이유, 30이 
//아이유를 참조하는 객체가 test1 메소드에 전달
//**아이유 객체는 사라지지 않고, 여기에서 박보검 객체가 새로 누적되어 적재된다.
//새롭게 만들어진 박보검 객체 참조변수는 기존 객체에 영향을 주지 않고, test1 소멸 후 사라진다.
//test1 내부에서 f local 변수(박보검 객체)는 사라진다.
//이후 f에 대한 getter은 기존 객체를 참조한다.
//test2의 경우에는 기존 객체에 대하여 접근하고 해당 변수를 바꾼다.
//이후 f에 대한 인스턴스 변수가 유재석으로 바뀐다.