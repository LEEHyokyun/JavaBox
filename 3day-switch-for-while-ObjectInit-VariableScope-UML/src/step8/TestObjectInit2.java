package step8;
//expect how attribute values would be aligned.
public class TestObjectInit2 {
	public static void main(String[] args) {
		Friend f = new Friend("������", 30);//���� ��ü
		FriendService service = new FriendService();// ��ü ���� �� �Ӽ� ��ȭ
		service.test1(f); //��ü�� ���ڸ� ���� ���޵Ǿ���.
		System.out.println(f.getName()+" "+f.getAge());
		service.test2(f);
		System.out.println(f.getName()+" "+f.getAge());
	}
}

//���� �����ڷ� ������, 30�� 
//�������� �����ϴ� ��ü�� test1 �޼ҵ忡 ����
//**������ ��ü�� ������� �ʰ�, ���⿡�� �ں��� ��ü�� ���� �����Ǿ� ����ȴ�.
//���Ӱ� ������� �ں��� ��ü ���������� ���� ��ü�� ������ ���� �ʰ�, test1 �Ҹ� �� �������.
//test1 ���ο��� f local ����(�ں��� ��ü)�� �������.
//���� f�� ���� getter�� ���� ��ü�� �����Ѵ�.
//test2�� ��쿡�� ���� ��ü�� ���Ͽ� �����ϰ� �ش� ������ �ٲ۴�.
//���� f�� ���� �ν��Ͻ� ������ ���缮���� �ٲ��.