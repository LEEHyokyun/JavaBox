package step4;

public class TestHasA {
	public static void main(String[] args) {
		School school = new School("õõ�ʵ��б�");
		System.out.println(school.getName());
		//���������δ� has a 
		//���������δ� consist of
		school.setBus(new Bus("�����ڵ���",30));
		System.out.println(school.getBus().getMaker());
		System.out.println(school.getBus().getCount());
	}
}
