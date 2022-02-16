package step1;

class Fish{
	int count;
	static int sCount;
	Fish(){
		count++;
		sCount++;
	}
}

public class TestStatic4 {
	public static void main(String[] args) {
		Fish f1 = new Fish(); //�������ʱ�ȭ �� ȣ��� ���� ���� 1�� ������
		System.out.println(f1.count); //������ f1���� 0->1 
		System.out.println(f1.sCount); //static�̶� �����ϰ� Fish class�� ���� metasapce�� ����
		System.out.println(Fish.sCount); //�ؾƲ �������� 0->1
		
		Fish f2 = new Fish();
		System.out.println(f2.count); //������ f2���� 0->1
		System.out.println(Fish.sCount); //�ؾƲ �������� 1->2
	}
}

/*
 * Fish class loading �������� �̹� Fish Ŭ������ �����ϰ�, metaspace�� static ������ �����Ѵ�.
 * 
 */