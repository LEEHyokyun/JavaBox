package step8;

public class FriendService {
	public void	test1(Friend f) { //매개변수의 data type은 객체가 될 수도 있다.
		//위를 통해 객체가 전달되었다.
		f = new Friend("박보검", 28);
	}
	public void test2(Friend f) { //이 역시 객체가 전달되었다.
		f.setName("유재석");
		f.setAge(50);
	}
}
