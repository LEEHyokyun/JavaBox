package step8;

public class FriendService {
	public void	test1(Friend f) { //�Ű������� data type�� ��ü�� �� ���� �ִ�.
		//���� ���� ��ü�� ���޵Ǿ���.
		f = new Friend("�ں���", 28);
	}
	public void test2(Friend f) { //�� ���� ��ü�� ���޵Ǿ���.
		f.setName("���缮");
		f.setAge(50);
	}
}
